package com.belhaj.gestiondesuivie.Contoller;

import com.belhaj.gestiondesuivie.Services.EmploiService;
import com.belhaj.gestiondesuivie.model.Eleve;
import com.belhaj.gestiondesuivie.model.Emplois;
import com.belhaj.gestiondesuivie.model.Parents;
import com.belhaj.gestiondesuivie.model.Surveillant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost4200")
@RestController
@RequestMapping("/api")
public class EmploiController {

    private final EmploiService emploiService;
    @Autowired
    public EmploiController(EmploiService emploiService) {
        this.emploiService = emploiService;
    }
    @GetMapping("/allemploi")
    public ResponseEntity<List<Emplois>> getAllEmplois() {
        List<Emplois> allEmplois = emploiService.getallEmplois();
        return new ResponseEntity(allEmplois, HttpStatus.OK);
    }
    @PostMapping("/addemploi")
    public ResponseEntity<Emplois>addEmplois(@RequestBody Emplois emplois) {
        Emplois newEmplois = emploiService.addEmplois(emplois);
        return new ResponseEntity<>(newEmplois, HttpStatus.CREATED);
    }
    @PutMapping("/updateemploi")
    public ResponseEntity<Emplois>updateEmplois(@RequestBody Emplois emplois) {
        Emplois updateEmplois = emploiService.updateEmplois(emplois);
        return new ResponseEntity<>(updateEmplois, HttpStatus.CREATED);
    }
    @DeleteMapping("/deleteemploi/{id}")
    public ResponseEntity<?>deleteEmplois (@PathVariable Integer id) {
        emploiService.deleteEmplois(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

