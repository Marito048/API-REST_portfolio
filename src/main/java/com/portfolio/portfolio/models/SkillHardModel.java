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
     
    
     Long porcentaje_duras;
     String titulo_duras;
     String descripcion_duras;

     public Long getPorcentaje_duras() {
         return this.porcentaje_duras;
     }

     public void setPorcentaje_duras(Long porcentaje_duras) {
         this.porcentaje_duras = porcentaje_duras;
     }

     public String getTitulo_duras() {
         return this.titulo_duras;
     }

     public void setTitulo_duras(String titulo_duras) {
         this.titulo_duras = titulo_duras;
     }

     public String getDescripcion_duras() {
         return this.descripcion_duras;
     }

     public void setDescripcion_duras(String descripcion_duras) {
         this.descripcion_duras = descripcion_duras;
     }

    
}
