package com.belhaj.gestiondesuivie.model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "Payement")
public class Payement {
  @Id
  @GeneratedValue
  @Column(name = "id", nullable = false)
  private Integer id;
  @Column(name = "abonnement_id")
  private Integer abonnementId;

  @Column(name = "parent_id")
  private Integer parentId;
}
