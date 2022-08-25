package com.belhaj.gestiondesuivie.Services;

import com.belhaj.gestiondesuivie.Repository.ClasseRepo;
import com.belhaj.gestiondesuivie.model.Classe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClasseService {
    private final ClasseRepo classeRepo ;
    @Autowired
    public ClasseService(ClasseRepo classeRepo) {
        this.classeRepo = classeRepo;
    }


    public List<Classe> getallClasses () {
        return classeRepo.findAll();
    }

    public Classe addClasse (Classe classe){
        return classeRepo.save(classe);
    }

    public Classe updateClasse (Integer id, Integer nombrheur ){
        Optional<Classe> classe = classeRepo.findById(id);
        Classe classe1 = classe.get();
        classe1.setNbrheurs(nombrheur);

        return classeRepo.save(classe1);
    }

    public Classe getById(Integer id){
        return classeRepo.getById(id);
    }

    public void deleteClasse (Integer id) {
        classeRepo.deleteById(id);
    }
}
