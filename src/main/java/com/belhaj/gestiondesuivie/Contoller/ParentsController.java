package com.belhaj.gestiondesuivie.Contoller;

import com.belhaj.gestiondesuivie.Services.ParentsService;
import com.belhaj.gestiondesuivie.model.Parents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/parents")
public class ParentsController {
    private final ParentsService parentsService;
    @Autowired
    public ParentsController(ParentsService parentsService) {
        this.parentsService = parentsService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Parents>> getAllParants(){
        List<Parents> allParants =parentsService.getallParants();
        return new ResponseEntity<>(allParants , HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Parents>addParents(@RequestBody Parents parents) {
        Parents newParents = parentsService.addParents(parents);
        return new  ResponseEntity<>(newParents , HttpStatus.CREATED);
    }
   @PutMapping("/update/{id}")
    public ResponseEntity<Parents>updateParents(@PathVariable(name = "id") Integer id, @RequestParam Integer numeroTel) {
        Parents updateParents= parentsService.updateParent(id, numeroTel);
        return new  ResponseEntity<>(updateParents , HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?>deleteParants (@PathVariable Integer id){
        parentsService.deleteParents(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
