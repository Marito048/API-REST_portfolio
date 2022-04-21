package com.portfolio.portfolio.models;

import javax.persistence.*;


@Entity
@Table(name="login")
public class LoginModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
        Long id_login;

    

    @Basic
        String usuario_login;
        String clave_login;
        String rol_login;

    public Long getId_login() {
        return this.id_login;
    }

    public void setId_login(Long id_login) {
        this.id_login = id_login;
    }
    public String getUsuario_login() {
        return this.usuario_login;
    }

    public void setUsuario_login(String usuario_login) {
        this.usuario_login = usuario_login;
    }

    public String getClave_login() {
        return this.clave_login;
    }

    public void setClave_login(String clave_login) {
        this.clave_login = clave_login;
    }

    public String getRol_login() {
        return this.rol_login;
    }

    public void setRol_login(String rol_login) {
        this.rol_login = rol_login;
    }


    
}
