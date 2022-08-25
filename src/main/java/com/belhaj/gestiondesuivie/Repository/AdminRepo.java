package com.belhaj.gestiondesuivie.Repository;

import com.belhaj.gestiondesuivie.model.Admin;
import com.belhaj.gestiondesuivie.model.Parents;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
}
