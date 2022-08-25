package com.belhaj.gestiondesuivie.Contoller;

import com.belhaj.gestiondesuivie.Services.ClasseService;
import com.belhaj.gestiondesuivie.model.Classe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/classe")
public class ClasseController {
    private final ClasseService classeService;
    @Autowired
    public ClasseController(ClasseService classeService) {
        this.classeService = classeService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Classe>>getAllClasses(){
        List<Classe> allClasse = classeService.getallClasses();
        return new ResponseEntity<>(allClasse , HttpStatus.OK);
    }
    @GetMapping("/get/{id}")
    public ResponseEntity<Classe>getClasseById(@PathVariable("id") Integer id){
       return ResponseEntity.ok(classeService.getById(id));
    }
    @PostMapping("/add")
    public ResponseEntity<Classe>addclasse(@RequestBody Classe classe) {
        Classe newClasse = classeService.addClasse(classe);
        return new  ResponseEntity<>(newClasse, HttpStatus.CREATED);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Classe>updateSalle(@PathVariable(name = "id")Integer id, @RequestParam Integer nombrheur) {
        Classe updateClasse = classeService.updateClasse(id, nombrheur);
        return new  ResponseEntity<>(updateClasse, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>deleteClasse (@PathVariable Integer id){
        classeService.deleteClasse(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
