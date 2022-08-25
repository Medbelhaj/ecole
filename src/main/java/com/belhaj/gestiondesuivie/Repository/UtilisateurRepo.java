package com.belhaj.gestiondesuivie.Repository;

import com.belhaj.gestiondesuivie.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepo extends JpaRepository<Utilisateur , Integer> {
}
