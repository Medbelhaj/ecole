package com.belhaj.gestiondesuivie.Services;

import com.belhaj.gestiondesuivie.Repository.ParentsRepo;
import com.belhaj.gestiondesuivie.model.Parents;
import com.belhaj.gestiondesuivie.model.Parents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParentsService {

    private final ParentsRepo parentsRepo;

    public ParentsService(ParentsRepo parentsRepo) {
        this.parentsRepo = parentsRepo;
    }


    public List<Parents> getallParants() {
        return parentsRepo.findAll();
    }

    public Parents addParents (Parents parents) {
        return parentsRepo.save(parents);
    }
    // njibo parent men base de donne b bel methode findbyid ba3d na3mlo modification ba3d na3mlo save
    public Parents updateParent(Integer id, Integer numeroTel){
        Optional<Parents> parents = parentsRepo.findById(id);
        Parents parents1 = parents.get();
        parents1.setNum(numeroTel);
        return parentsRepo.save(parents1);
    }

    public void deleteParents(Integer id) {
        parentsRepo.deleteById(id);
    }
}
