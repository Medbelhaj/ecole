package com.belhaj.gestiondesuivie.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@EqualsAndHashCode(callSuper = false)
@Table(name = "emplois")
public class Emplois{
  @Id
  private Integer id;
  private Date date;
  private Date heure_de_debut;
  private Date heure_de_fin;
  @OneToMany(mappedBy = "emploi")
  private List<Matiere> matiere;
  @OneToMany(mappedBy = "emplois")
  private List<Classe> classes;

}

