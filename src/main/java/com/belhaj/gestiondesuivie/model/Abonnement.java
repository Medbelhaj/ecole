package com.belhaj.gestiondesuivie.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@NoArgsConstructor
@Data
@Entity
@EqualsAndHashCode(callSuper = true)
@Table(name = "abonnement")
public class Abonnement extends Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "abonnement_id")
    private Integer id;
    @ManyToMany
    @JoinColumns({
            @JoinColumn(name = "parent_id", insertable = false , updatable = false),
            @JoinColumn(name = "abonnement_id", insertable= false, updatable= false)
    })
    Set<Parents> modePayAbonnement;
}
