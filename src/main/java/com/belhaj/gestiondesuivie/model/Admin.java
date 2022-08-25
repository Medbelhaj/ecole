package com.belhaj.gestiondesuivie.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@AllArgsConstructor
  @NoArgsConstructor
  @Data
  @Entity
  @EqualsAndHashCode(callSuper = true)
  @Table(name = "admin")

  public class Admin extends Utilisateur {
  private Integer num;
  @OneToMany(mappedBy ="admin")
    private List<ComptUser> comptUsers;

  }
