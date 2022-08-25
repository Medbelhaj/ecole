package com.belhaj.gestiondesuivie.Contoller;

import com.belhaj.gestiondesuivie.Services.EnseignantService;
import com.belhaj.gestiondesuivie.Services.EnseignantService;
import com.belhaj.gestiondesuivie.model.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Enseignant")
public class EnseignantController {
    private final EnseignantService EnseignantService;
    @Autowired
    public EnseignantController(EnseignantService enseignantService) {
        this.EnseignantService = enseignantService ;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Enseignant>> getAllEnseignant(){
        List<Enseignant> allEnseignant = EnseignantService.getallEnseignant();
        return new ResponseEntity(allEnseignant , HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Enseignant>addEnseignant(@RequestBody Enseignant enseignant) {
        Enseignant newEnseignant = EnseignantService.addEnseignant(enseignant);
        return new  ResponseEntity<>(newEnseignant , HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Enseignant>updateEnseignant(@RequestBody Enseignant enseignant) {
        Enseignant updateEnseignant = EnseignantService.updateEnseignant(enseignant);
        return new  ResponseEntity<>(updateEnseignant , HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>deleteEnseignant (@PathVariable Integer id){
        EnseignantService.deleteEnseignant(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
