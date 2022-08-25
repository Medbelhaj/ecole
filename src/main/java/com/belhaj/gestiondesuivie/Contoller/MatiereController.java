package com.belhaj.gestiondesuivie.Contoller;

import com.belhaj.gestiondesuivie.Services.MatiereService;
import com.belhaj.gestiondesuivie.Services.MatiereService;
import com.belhaj.gestiondesuivie.model.Matiere;
import com.belhaj.gestiondesuivie.model.Parents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matiere")
public class MatiereController {
    private final MatiereService MatiereService;
    @Autowired
    public MatiereController(MatiereService matiereService) {
        this.MatiereService = matiereService ;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Parents>> getAllMatiere(){
        List<Matiere> allMatiere = MatiereService.getallMatiere();
        return new ResponseEntity(allMatiere , HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Matiere>addMatiere(@RequestBody Matiere matiere) {
        Matiere newMatiere = MatiereService.addMatiere(matiere);
        return new  ResponseEntity<>(newMatiere , HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Matiere>updateMatiere(@RequestBody Matiere matiere) {
        Matiere updateMatiere = MatiereService.updateMatiere(matiere);
        return new  ResponseEntity<>(updateMatiere , HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>deleteMatiere (@PathVariable Integer id){
        MatiereService.deleteMatiere(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
