package com.portfolio.portfolio.models;

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
    private int id_interes;
    private String tipo_interes;

    public int getId_interes() {
        return this.id_interes;
    }

    public void setId_interes(int id_interes) {
        this.id_interes = id_interes;
    }

    public String getTipo_interes() {
        return this.tipo_interes;
    }

    public void setTipo_interes(String tipo_interes) {
        this.tipo_interes = tipo_interes;
    }

        


   
    

    
}
