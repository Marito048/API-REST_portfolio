package com.portfolio.portfolio.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "educacion")

public class EducacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    
    private int id_educacion;
    private String institucion_educacion;
    private Date ingreso_educacion;
    private Date egreso_educacion;
    private String titulo_educacion;
    private String detalles_educacion;

    public int getId_educacion() {
        return this.id_educacion;
    }

    public void setId_educacion(int id_educacion) {
        this.id_educacion = id_educacion;
    }

    public String getInstitucion_educacion() {
        return this.institucion_educacion;
    }

    public void setInstitucion_educacion(String institucion_educacion) {
        this.institucion_educacion = institucion_educacion;
    }

    public Date getIngreso_educacion() {
        return this.ingreso_educacion;
    }

    public void setIngreso_educacion(Date ingreso_educacion) {
        this.ingreso_educacion = ingreso_educacion;
    }

    public Date getEgreso_educacion() {
        return this.egreso_educacion;
    }

    public void setEgreso_educacion(Date egreso_educacion) {
        this.egreso_educacion = egreso_educacion;
    }

    public String getTitulo_educacion() {
        return this.titulo_educacion;
    }

    public void setTitulo_educacion(String titulo_educacion) {
        this.titulo_educacion = titulo_educacion;
    }

    public String getDetalles_educacion() {
        return this.detalles_educacion;
    }

    public void setDetalles_educacion(String detalles_educacion) {
        this.detalles_educacion = detalles_educacion;
    }


    
}
