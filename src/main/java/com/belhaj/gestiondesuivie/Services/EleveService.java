package com.belhaj.gestiondesuivie.Services;

import com.belhaj.gestiondesuivie.Repository.EleveRepo;
import com.belhaj.gestiondesuivie.Repository.EleveRepo;
import com.belhaj.gestiondesuivie.model.Eleve;
import com.belhaj.gestiondesuivie.model.Eleve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EleveService {
    private final EleveRepo eleveRepo;

    @Autowired
    public EleveService(EleveRepo eleveRepo) {
        this.eleveRepo = eleveRepo;
    }
    public List<Eleve> getallEleve() {
        return eleveRepo.findAll();

    }

    public Eleve addEleve (Eleve eleve) {
        return eleveRepo.save(eleve);
    }

    //ghalta
    public Eleve updateEleve (Integer id, String emailE){
        Optional<Eleve> eleve = eleveRepo.findById(id);
        Eleve eleve1 = eleve.get();
        eleve1.setEmail(emailE);
        return eleveRepo.save(eleve1);
    }

    public void deleteEleve(Integer id) {
        eleveRepo.deleteById(id);
    }
}
