package com.belhaj.gestiondesuivie.Contoller;


import com.belhaj.gestiondesuivie.Services.UtilisateurService;
import com.belhaj.gestiondesuivie.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/utilisateur")
public class UtilisaterController {
    @Autowired
    public UtilisaterController(UtilisateurService utilisateurService) { this.utilisateurService = utilisateurService;}
    public final UtilisateurService utilisateurService;
    @GetMapping("/all")
    public ResponseEntity<List<Utilisateur>> getAllUtilisateur(){
        List<Utilisateur> allUtilisateur = utilisateurService.getallUtilisateur();
        return new ResponseEntity<>(allUtilisateur , HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Utilisateur>addUtilisateur(@RequestBody Utilisateur utilisateur) {
        Utilisateur newUtilisateur = utilisateurService.addUtilisateur(utilisateur);
        return new  ResponseEntity<>(newUtilisateur , HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Utilisateur>updateutilisateur(@RequestBody Utilisateur utilisateur) {
        Utilisateur updateUtilisateur = utilisateurService.updateUtilisateur(utilisateur);
        return new ResponseEntity<>(updateUtilisateur, HttpStatus.CREATED);
    }
        @DeleteMapping("/delete/{id}")
        public ResponseEntity<?>deleteUtilisateur (@PathVariable Integer id){
            utilisateurService.deleteUtilisateur(id);
            return new ResponseEntity<>(HttpStatus.OK);
    }
}
