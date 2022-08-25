package com.belhaj.gestiondesuivie.Repository;

import com.belhaj.gestiondesuivie.model.Emplois;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmploiRepo extends JpaRepository<Emplois, Integer> {
}
