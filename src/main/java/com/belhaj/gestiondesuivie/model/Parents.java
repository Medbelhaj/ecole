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
@Table(name = "parents")

public class Parents extends Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "parent_id")
    private Integer id;
    private Integer cin;
    private Integer num;
    @ManyToMany
    @JoinColumns({
            @JoinColumn(name = "enseignant_id", insertable = false , updatable = false),
            @JoinColumn(name = "parent_id", insertable = false, updatable = false)
            })

    Set<Enseignant> enseignantMessages;


    @ManyToMany(mappedBy = "modePayAbonnement")
    Set<Abonnement> modePayParents;
  private String messages;
  private Date dateDenvoi;
}
