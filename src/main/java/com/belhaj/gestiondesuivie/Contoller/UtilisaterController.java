package com.belhaj.gestiondesuivie.Contoller;


import com.belhaj.gestiondesuivie.Repository.UserRepo;
import com.belhaj.gestiondesuivie.Services.UtilisateurService;
import com.belhaj.gestiondesuivie.model.User;
import com.belhaj.gestiondesuivie.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UtilisaterController {
    @Autowired
    UserRepo userRepo;
    @Autowired
    public UtilisaterController(UtilisateurService utilisateurService) { this.utilisateurService = utilisateurService;}
    public final UtilisateurService utilisateurService;
    @GetMapping("/allutilisateur")
    public ResponseEntity<List<Utilisateur>> getAllUtilisateur(){
        List<Utilisateur> allUtilisateur = utilisateurService.getallUtilisateur();
        return new ResponseEntity<>(allUtilisateur , HttpStatus.OK);
    }
    @GetMapping("/user/{id}")
    public Optional<User> getUser(@PathVariable("id") Long id) {
        Optional<User> user = userRepo.findById(id);
        return user;
    }
    @PostMapping("/addutilisateur")
    public ResponseEntity<Utilisateur>addUtilisateur(@RequestBody Utilisateur utilisateur) {
        Utilisateur newUtilisateur = utilisateurService.addUtilisateur(utilisateur);
        return new  ResponseEntity<>(newUtilisateur , HttpStatus.CREATED);
    }
    @PutMapping("/updateutilisateur/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value = "id") Long userId,
                                           @Valid @RequestBody User userDTO) {
        User user= userRepo.findById(userId)


                .orElseThrow(() -> new RuntimeException("user not found for this id :: " + userId));


        user.setUsername(userDTO.getUsername());

        user.setLastname(userDTO.getLastname());
        user.setEmail(userDTO.getEmail());
        user.setCin(userDTO.getCin());
        user.setNumeroTel(userDTO.getNumeroTel());
        user.setDateNai(userDTO.getDateNai());
        final User updateuser = userRepo.save(user);
        return ResponseEntity.ok(updateuser);
    }
        @DeleteMapping("/deleteutilisateur/{id}")
        public ResponseEntity<?>deleteUtilisateur (@PathVariable Integer id){
            utilisateurService.deleteUtilisateur(id);
            return new ResponseEntity<>(HttpStatus.OK);
    }

}
