package com.portfolio.portfolio.models;
import javax.persistence.*;
import javax.persistence.GenerationType;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@Entity
@Table(name="habilidadesBlandas")


public class SkillSoftModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
     Long id_blandas;
    
    @Basic
    Long porcentaje_blandas;
    String titulo_blandas;
    String descripcion_blandas;

    
}
