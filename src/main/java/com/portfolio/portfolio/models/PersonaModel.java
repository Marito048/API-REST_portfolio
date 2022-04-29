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
}