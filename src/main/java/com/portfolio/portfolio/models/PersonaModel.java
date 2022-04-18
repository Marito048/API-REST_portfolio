package com.portfolio.portfolio.models;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity 
@Table(name = "persona")
public class PersonaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
        Long id_persona;
    @Basic
    String nombre_persona;
    String apellido_persona;
    String ubicacion_persona;
    String telefono_persona;
    String email_persona;
    String titulo_persona;
    String foto_persona;
    String banner_persona;
    String acercade_persona;

    public Long getId_persona() {
        return this.id_persona;
    }

    public void setId_persona(Long id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombre_persona() {
        return this.nombre_persona;
    }

    public void setNombre_persona(String nombre_persona) {
        this.nombre_persona = nombre_persona;
    }

    public String getApellido_persona() {
        return this.apellido_persona;
    }

    public void setApellido_persona(String apellido_persona) {
        this.apellido_persona = apellido_persona;
    }

    public String getUbicacion_persona() {
        return this.ubicacion_persona;
    }

    public void setUbicacion_persona(String ubicacion_persona) {
        this.ubicacion_persona = ubicacion_persona;
    }

    public String getTelefono_persona() {
        return this.telefono_persona;
    }

    public void setTelefono_persona(String telefono_persona) {
        this.telefono_persona = telefono_persona;
    }

    public String getEmail_persona() {
        return this.email_persona;
    }

    public void setEmail_persona(String email_persona) {
        this.email_persona = email_persona;
    }

    public String getTitulo_persona() {
        return this.titulo_persona;
    }

    public void setTitulo_persona(String titulo_persona) {
        this.titulo_persona = titulo_persona;
    }

    public String getFoto_persona() {
        return this.foto_persona;
    }

    public void setFoto_persona(String foto_persona) {
        this.foto_persona = foto_persona;
    }

    public String getBanner_persona() {
        return this.banner_persona;
    }

    public void setBanner_persona(String banner_persona) {
        this.banner_persona = banner_persona;
    }

    public String getAcercade_persona() {
        return this.acercade_persona;
    }

    public void setAcercade_persona(String acercade_persona) {
        this.acercade_persona = acercade_persona;
    }

    
    
}