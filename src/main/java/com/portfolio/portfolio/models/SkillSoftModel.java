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
    
     Long porcentaje_blandas;
     String titulo_blandas;
     String descripcion_blandas;

     public Long getPorcentaje_blandas() {
         return this.porcentaje_blandas;
     }

     public void setPorcentaje_blandas(Long porcentaje_blandas) {
         this.porcentaje_blandas = porcentaje_blandas;
     }

     public String getTitulo_blandas() {
         return this.titulo_blandas;
     }

     public void setTitulo_blandas(String titulo_blandas) {
         this.titulo_blandas = titulo_blandas;
     }

     public String getDescripcion_blandas() {
         return this.descripcion_blandas;
     }

     public void setDescripcion_blandas(String descripcion_blandas) {
         this.descripcion_blandas = descripcion_blandas;
     }

    
}
