package com.belhaj.gestiondesuivie.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@MappedSuperclass
public class Utilisateur implements Serializable {
  @Id
  @GeneratedValue
  @Column(name = "id", nullable = false)
  private Integer id;
  private String nom;
  private String prenom;
  private String email;
  @Column(name = "Motdepasee")
  private String mdp;
  @Column(name="Datedenaissance" )
 private Date dateNai;





}
