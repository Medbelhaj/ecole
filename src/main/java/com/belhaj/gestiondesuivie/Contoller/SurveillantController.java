package com.belhaj.gestiondesuivie.Contoller;

import com.belhaj.gestiondesuivie.Services.AdminService;
import com.belhaj.gestiondesuivie.Services.SurveillantService;
import com.belhaj.gestiondesuivie.model.Admin;
import com.belhaj.gestiondesuivie.model.Parents;
import com.belhaj.gestiondesuivie.model.Surveillant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class SurveillantController {
    private final SurveillantService surveillantService;
    @Autowired
    public SurveillantController(SurveillantService surveillantService) {
        this.surveillantService = surveillantService ;
    }

    @GetMapping("/allsurveillant")
    public ResponseEntity<List<Surveillant>> getAllSurveillant(){
        List<Surveillant> allSurveillant = surveillantService.getallSurveillant();
        return new ResponseEntity(allSurveillant , HttpStatus.OK);
    }

    @PostMapping("/addsurveillant")
    public ResponseEntity<Surveillant>addSurveillant(@RequestBody Surveillant surveillant) {
        Surveillant newSurveillant = surveillantService.addSurveillant(surveillant);
        return new  ResponseEntity<>(newSurveillant , HttpStatus.CREATED);
    }
    @PutMapping("/updatesurveillant/{id}")
    public ResponseEntity<Surveillant>updateSurveillant(@PathVariable(name = "id")Integer id, @RequestParam Integer numTel) {
        Surveillant updateSurveillant = surveillantService.updateSurveillant(id,numTel);
        return new  ResponseEntity<>(updateSurveillant , HttpStatus.CREATED);
    }

    @DeleteMapping("/deletesurveillant/{id}")
    public ResponseEntity<?>deleteSurveillant (@PathVariable Integer id){
        surveillantService.deleteSurveillant(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
