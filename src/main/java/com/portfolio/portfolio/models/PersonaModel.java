package com.portfolio.portfolio.models;
import javax.persistence.*;


@Entity 
@Table(name = "persona")
public class PersonaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    
    private int id_persona;
    private String nombre_persona;
    private String apellido_persona;
    private String ubicacion_persona;
    private String telefono_persona;
    private String email_persona;
    private String titulo_persona;
    private String foto_persona;
    private String banner_persona;
    private String acercade_persona;

    public int getId_persona() {
        return this.id_persona;
    }

    public void setId_persona(int id_persona) {
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

    public String getUbucacion_persona() {
        return this.ubicacion_persona;
    }

    public void setUbucacion_persona(String ubucacion_persona) {
        this.ubicacion_persona = ubucacion_persona;
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