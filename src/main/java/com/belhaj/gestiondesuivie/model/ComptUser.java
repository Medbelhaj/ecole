package com.belhaj.gestiondesuivie.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "comptUser")
public class ComptUser extends Utilisateur {
  @ManyToOne
  @JoinColumn(name = "idAdmin")
  private Admin admin;
}
