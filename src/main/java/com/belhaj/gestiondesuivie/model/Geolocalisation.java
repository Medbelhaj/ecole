package com.belhaj.gestiondesuivie.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "geolocalisation")
public class Geolocalisation {
    @Id
    @GeneratedValue
    private Integer id;
    private String adress;
}
