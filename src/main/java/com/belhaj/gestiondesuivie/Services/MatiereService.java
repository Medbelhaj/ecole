package com.belhaj.gestiondesuivie.Services;

import com.belhaj.gestiondesuivie.Repository.MatiereRepo;
import com.belhaj.gestiondesuivie.Repository.MatiereRepo;
import com.belhaj.gestiondesuivie.model.Matiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatiereService {
    @Autowired
    public MatiereService(MatiereRepo matiereRepo) {
        this.MatiereRepo = matiereRepo;
    }
    private final MatiereRepo MatiereRepo;
    public List<Matiere> getallMatiere() {
        return MatiereRepo.findAll();

    }

    public Matiere addMatiere (Matiere matiere) {
        return MatiereRepo.save(matiere);
    }

    public Matiere updateMatiere (Matiere matiere) {
        return MatiereRepo.save(matiere);
    }

    public void deleteMatiere(Integer id) {
        MatiereRepo.deleteById(id);
    }
}
