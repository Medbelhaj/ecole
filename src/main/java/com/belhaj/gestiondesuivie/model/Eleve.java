package com.belhaj.gestiondesuivie.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "eleve")
public class Eleve extends Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "eleve_id")
    private Integer id;

    @ManyToMany
    @JoinTable(
            name = "eleveConsulte",
            joinColumns = @JoinColumn(name = "matier_id"),
            inverseJoinColumns = @JoinColumn(name = "eleve_id"))
    // eleve howa bch i3adi examen -> examen f matiere mo3ayna
    Set<Matiere> consulterMatiere;
}
