package com.belhaj.gestiondesuivie.Repository;

import com.belhaj.gestiondesuivie.model.Eleve;
import com.belhaj.gestiondesuivie.model.Matiere;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatiereRepo extends JpaRepository<Matiere, Integer> {
}
