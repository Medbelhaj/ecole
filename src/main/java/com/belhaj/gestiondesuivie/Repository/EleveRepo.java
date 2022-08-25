package com.belhaj.gestiondesuivie.Repository;

import com.belhaj.gestiondesuivie.model.Admin;
import com.belhaj.gestiondesuivie.model.Eleve;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EleveRepo extends JpaRepository<Eleve, Integer> {
}
