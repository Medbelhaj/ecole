package com.belhaj.gestiondesuivie.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "Surveillant")

public class Surveillant extends Utilisateur {
  @Column(name = "NumCin")
  private Integer numcin;
  private Integer num;

}
