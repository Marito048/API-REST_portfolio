package com.portfolio.portfolio.models;
import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity 
@Table(name = "social")

public class SocialModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
        int id_social;
    @Basic
        String red_social;
        String icono_social;
    
    
    
}