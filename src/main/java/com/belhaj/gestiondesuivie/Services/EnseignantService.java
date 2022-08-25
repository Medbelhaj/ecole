package com.belhaj.gestiondesuivie.Services;

import com.belhaj.gestiondesuivie.Repository.EnseignantRepo;
import com.belhaj.gestiondesuivie.model.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnseignantService {

    private final EnseignantRepo enseignantRepo;

    @Autowired
    public EnseignantService(EnseignantRepo enseignantRepo) {
        this.enseignantRepo = enseignantRepo;
    }

    public List<Enseignant> getallEnseignant() {
        return enseignantRepo.findAll();

    }

    public Enseignant addEnseignant (Enseignant enseignant) {
        return enseignantRepo.save(enseignant);
    }

    public Enseignant updateEnseignant (Enseignant enseignant) {
        return enseignantRepo.save(enseignant);
    }

    public void deleteEnseignant(Integer id) {
        enseignantRepo.deleteById(id);
    }
}
