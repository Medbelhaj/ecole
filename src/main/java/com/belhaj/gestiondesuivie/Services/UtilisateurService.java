package com.belhaj.gestiondesuivie.Services;

import com.belhaj.gestiondesuivie.Repository.UtilisateurRepo;
import com.belhaj.gestiondesuivie.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtilisateurService {
    @Autowired
    public UtilisateurService(UtilisateurRepo utilisateurRepo) {
        this.utilisateurRepo = utilisateurRepo;
    }
    public final UtilisateurRepo utilisateurRepo;
    public List<Utilisateur> getallUtilisateur() {
        return utilisateurRepo.findAll();
    }

    public Utilisateur addUtilisateur (Utilisateur utilisateur) {
        return utilisateurRepo.save(utilisateur);
    }

    public Utilisateur updateUtilisateur (Utilisateur utilisateur) {
        return utilisateurRepo.save(utilisateur);
    }

    public void deleteUtilisateur(Integer id) {
        utilisateurRepo.deleteById(id);
    }
}
