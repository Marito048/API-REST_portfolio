package com.portfolio.portfolio.models;
import javax.persistence.*;
import javax.persistence.GenerationType;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="interes")

public class InteresModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
     Long id_interes;
    
    @Basic
    String descripcion_interes;

        
}
