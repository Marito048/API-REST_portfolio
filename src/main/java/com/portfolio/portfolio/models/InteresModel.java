package com.portfolio.portfolio.models;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="interes")


public class InteresModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
     Long id_interes;
    
    @Basic
    String descripcion_interes;

    public Long getId_interes() {
        return this.id_interes;
    }

    public void setId_interes(Long id_interes) {
        this.id_interes = id_interes;
    }

    public String getTipo_interes() {
        return this.descripcion_interes;
    }

    public void setTipo_interes(String descripcion_interes) {
        this.descripcion_interes = descripcion_interes;
    }

        


   
    

    
}
