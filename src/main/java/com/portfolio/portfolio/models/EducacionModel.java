package com.portfolio.portfolio.models;
import java.sql.Date;
import javax.persistence.*;
import javax.persistence.GenerationType;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter 
@Entity

@Table(name = "educacion")

public class EducacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    
     Long id_educacion;
    @Basic  
     String institucion_educacion;
     Date ingreso_educacion;
     Date egreso_educacion;
     String titulo_educacion;
     String detalles_educacion;

    

    
}
