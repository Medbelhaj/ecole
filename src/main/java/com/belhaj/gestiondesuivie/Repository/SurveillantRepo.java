package com.belhaj.gestiondesuivie.Repository;

import com.belhaj.gestiondesuivie.model.Admin;
import com.belhaj.gestiondesuivie.model.Surveillant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurveillantRepo extends JpaRepository<Surveillant, Integer> {
}
