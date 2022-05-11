package com.portfolio.portfolio.models;
import javax.persistence.*;
import lombok.*;



@Getter @Setter
@Entity
@Table(name = "habilidadesDuras")

public class SkillHardModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
        int id_duras;
    @Basic
        int porcentaje_duras; 
        String titulo_duras;
        String descripcion_duras;

    
}
