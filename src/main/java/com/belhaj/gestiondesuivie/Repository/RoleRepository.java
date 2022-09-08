package com.belhaj.gestiondesuivie.Repository;

import com.belhaj.gestiondesuivie.model.ERole;
import com.belhaj.gestiondesuivie.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);

}
