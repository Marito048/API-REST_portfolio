package com.portfolio.portfolio.models;
import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name = "laboral")

public class LaboralModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    
    public Long id_laboral;

    @Basic
    String empresa_laboral;
    String logo_laboral;
    String puesto_laboral;
    Date ingreso_laboral;
    Date egreso_laboral;
    String descripcion_laboral;

    public Long getId_laboral() {
        return this.id_laboral;
    }

    public void setId_laboral(Long id_laboral) {
        this.id_laboral = id_laboral;
    }

    public String getEmpresa_laboral() {
        return this.empresa_laboral;
    }

    public void setEmpresa_laboral(String empresa_laboral) {
        this.empresa_laboral = empresa_laboral;
    }

    public String getLogo_laboral() {
        return this.logo_laboral;
    }

    public void setLogo_laboral(String logo_laboral) {
        this.logo_laboral = logo_laboral;
    }

    public String getPuesto_laboral() {
        return this.puesto_laboral;
    }

    public void setPuesto_laboral(String puesto_laboral) {
        this.puesto_laboral = puesto_laboral;
    }

    public Date getIngreso_laboral() {
        return this.ingreso_laboral;
    }

    public void setIngreso_laboral(Date ingreso_laboral) {
        this.ingreso_laboral = ingreso_laboral;
    }

    public Date getEgreso_laboral() {
        return this.egreso_laboral;
    }

    public void setEgreso_laboral(Date egreso_laboral) {
        this.egreso_laboral = egreso_laboral;
    }

    public String getDescripcion_laboral() {
        return this.descripcion_laboral;
    }

    public void setDescripcion_laboral(String descripcion_laboral) {
        this.descripcion_laboral = descripcion_laboral;
    }
    
    
    

    


}
