package com.portfolio.portfolio.models;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter 
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

    
    
}
