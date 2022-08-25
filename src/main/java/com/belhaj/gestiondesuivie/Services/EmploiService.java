package com.belhaj.gestiondesuivie.Services;

import com.belhaj.gestiondesuivie.Repository.EmploiRepo;
import com.belhaj.gestiondesuivie.model.Emplois;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmploiService {
    private  final EmploiRepo emploiRepo;
    @Autowired
    public EmploiService(EmploiRepo emploiRepo) {
        this.emploiRepo = emploiRepo;
    }
    public Emplois createEmploi(Emplois emplois){
        return emploiRepo.save(emplois);
    }
    public List<Emplois> getallEmplois() {
        return emploiRepo.findAll();
    }
    public Emplois addEmplois(Emplois emplois) {
        return emploiRepo.save(emplois);
    }
    public Emplois updateEmplois(Emplois emplois) {
        return emploiRepo.save(emplois);
    }
    public void deleteEmplois(Integer id) {emploiRepo.deleteById(id);
    }

}
