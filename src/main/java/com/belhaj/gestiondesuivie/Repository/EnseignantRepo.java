package com.belhaj.gestiondesuivie.Repository;

import com.belhaj.gestiondesuivie.model.Enseignant;
import com.belhaj.gestiondesuivie.model.Surveillant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnseignantRepo extends JpaRepository<Enseignant, Integer> {
}
