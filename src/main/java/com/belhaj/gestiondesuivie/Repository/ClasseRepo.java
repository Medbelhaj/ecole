package com.belhaj.gestiondesuivie.Repository;

import com.belhaj.gestiondesuivie.model.Classe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasseRepo extends JpaRepository <Classe, Integer> {
}
