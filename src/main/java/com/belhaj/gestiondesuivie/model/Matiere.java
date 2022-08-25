package com.belhaj.gestiondesuivie.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "matier")
public class Matiere {
  @Id
  @GeneratedValue
  private Integer id;
  private String nom;
  @Column(name = "nombredesheurs")
  private String nmbrheurs;
  @ManyToMany
  @JoinColumns({
          @JoinColumn(name = "enseignant_id", insertable = false , updatable = false),
          @JoinColumn(name = "matier_id", insertable= false, updatable= false)
  })
  // set ya3ni lista donc 3andna set mte3 enseignants eli tab3in matiers mo3ayn
  Set<Enseignant> enseignants;
  @ManyToMany(mappedBy = "consulterMatiere")
  Set<Eleve> eleveConsulte;
  @ManyToOne
  @JoinColumn(name = "emploi")
  private Emplois emploi;

}
