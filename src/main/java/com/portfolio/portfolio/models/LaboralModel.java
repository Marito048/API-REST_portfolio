package com.portfolio.portfolio.models;
import java.sql.Date;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter 
@Entity
@Table(name = "laboral")

public class LaboralModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    
    public Long id_laboral;

    @Basic
    String empresa_laboral;
    String logo_laboral;
    String puesto_laboral;
    Date ingreso_laboral;
    Date egreso_laboral;
    String descripcion_laboral;

    


}
