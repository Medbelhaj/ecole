package com.belhaj.gestiondesuivie.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "classe")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Classe {
  @Id
  @GeneratedValue (strategy = GenerationType.AUTO)
  @Column (nullable = false , updatable = false)
  private Integer id;
  @NonNull
  private String nom;
  @Column(name = "nombreheurs")
  private Integer nbrheurs;
  @ManyToOne
  @JoinColumn(name = "idEmploi")
  private Emplois emplois;
  private String libelleClasse;

}
