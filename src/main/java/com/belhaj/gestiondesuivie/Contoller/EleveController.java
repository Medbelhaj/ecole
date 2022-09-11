package com.belhaj.gestiondesuivie.Contoller;

import com.belhaj.gestiondesuivie.Services.EleveService;
import com.belhaj.gestiondesuivie.Services.EleveService;
import com.belhaj.gestiondesuivie.model.Eleve;
import com.belhaj.gestiondesuivie.model.Parents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EleveController {

    private final EleveService eleveService;
    @Autowired
    public EleveController(EleveService eleveService) {
        this.eleveService = eleveService ;
    }

    @GetMapping("/alleleve")
    public ResponseEntity<List<Eleve>> getAllEleve(){
        List<Eleve> allEleve = eleveService.getallEleve();
        return new ResponseEntity(allEleve , HttpStatus.OK);
    }

    @PostMapping("/addeleve")
    public ResponseEntity<Eleve>addEleve(@RequestBody Eleve eleve) {
        Eleve newEleve = eleveService.addEleve(eleve);
        return new  ResponseEntity<>(newEleve , HttpStatus.CREATED);
    }
    @PutMapping("/updateeleve/{id}")
    public ResponseEntity<Eleve>updateEleve(@PathVariable (name = "id") Integer id, @RequestParam String emailE ){
        Eleve updateEleve = eleveService.updateEleve(id, emailE);
        return new  ResponseEntity<>(updateEleve , HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteeleve/{id}")
    public ResponseEntity<?>deleteEleve (@PathVariable Integer id){
        eleveService.deleteEleve(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
