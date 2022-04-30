package com.portfolio.portfolio.models;

import javax.persistence.*;
import javax.persistence.GenerationType;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@Entity
@Table(name="habilidadesDuras")


public class SkillHardModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
     Long id_duras;
     
    @Basic
    Long porcentaje_duras;
    String titulo_duras;
    String descripcion_duras;

    
}
