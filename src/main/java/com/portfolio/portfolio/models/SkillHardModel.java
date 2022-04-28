package com.portfolio.portfolio.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@Entity
@Table(name="hardSkill")


public class SkillHardModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
     Long id_duras;
    
    @Basic
    String porcentajes_duras;
    String titulo_duras;
    String descripcion_duras;

    
}
