package com.belhaj.gestiondesuivie.Services;

import com.belhaj.gestiondesuivie.Repository.SurveillantRepo;
import com.belhaj.gestiondesuivie.model.Surveillant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurveillantService {
    @Autowired
    public SurveillantService(com.belhaj.gestiondesuivie.Repository.SurveillantRepo SurveillantRepo) {
        this.SurveillantRepo = SurveillantRepo;
    }
    public final com.belhaj.gestiondesuivie.Repository.SurveillantRepo SurveillantRepo;
    public List<Surveillant> getallSurveillant() {
        return SurveillantRepo.findAll();

    }

    public Surveillant addSurveillant (Surveillant Surveillant) {
        return SurveillantRepo.save(Surveillant);
    }

    public Surveillant updateSurveillant (Integer id, Integer numTel) {
        Optional<Surveillant> surveillant = SurveillantRepo.findById(id);
        Surveillant surveillant1 = surveillant.get();
        surveillant1.setNum(numTel);
        return SurveillantRepo.save(surveillant1);
    }

    public void deleteSurveillant(Integer id) {
        SurveillantRepo.deleteById(id);
    }
}
