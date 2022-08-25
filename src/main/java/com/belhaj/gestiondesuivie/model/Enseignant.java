package com.belhaj.gestiondesuivie.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "enseignant")
public class Enseignant extends  Utilisateur{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  private Integer cin;
  @ManyToMany(mappedBy = "enseignantMessages")
  Set<Parents> parentsMessages;
  private String messages;
  private Date dateDenvoi;
 /**@ManyToMany(mappedBy = "enseignants")
  // set ya3ni lista donc 3andna set mte3 matiers eli tab3in prof mo3ayn
  Set<Matiere> matieres;**/
}
