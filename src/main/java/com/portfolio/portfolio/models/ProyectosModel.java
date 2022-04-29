package com.portfolio.portfolio.models;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity 
@Table(name = "proyecto")
public class ProyectosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
        Long id_proyectos;
    @Basic
        String link_proyectos;
        String descripcion_proyectos;
    
    
}
