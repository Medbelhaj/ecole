package com.belhaj.gestiondesuivie.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "examen")
public class Examen {
  @Id
  @Column(name = "id", nullable = false)
  private Integer id;


  @Column(name = "eleve_id")
  private Integer eleveId;

  @Column(name = "matier_id")
  private Integer matierId;
  @Column(name = "enseignant_id")
  private Integer enseignantId;
}
