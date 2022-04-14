package com.portfolio.portfolio.models;
import javax.persistence.*;

@Entity
@Table(name = "laboral")

public class LaboralModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    
    public int id_laboral;
    public String empresa_laboral;
    public String logo_laboral;
    public String puesto_laboral;
    public String ingreso_laboral;
    public String egreso_laboral;
    public String descripcion_laboral;
    
    
    public int getId_laboral() {
        return this.id_laboral;
    }

    public void setId_laboral(int id_laboral) {
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

    public String getIngreso_laboral() {
        return this.ingreso_laboral;
    }

    public void setIngreso_laboral(String ingreso_laboral) {
        this.ingreso_laboral = ingreso_laboral;
    }

    public String getEgreso_laboral() {
        return this.egreso_laboral;
    }

    public void setEgreso_laboral(String egreso_laboral) {
        this.egreso_laboral = egreso_laboral;
    }

    public String getDescripcion_laboral() {
        return this.descripcion_laboral;
    }

    public void setDescripcion_laboral(String descripcion_laboral) {
        this.descripcion_laboral = descripcion_laboral;
    }

  

    


}
