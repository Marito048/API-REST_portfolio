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
        Long id_social;
    @Basic
        String github_social;
        String facebook_social;
        String instagram_social;
        String linkedin_social;
        String twitter_social;
           
    
    
}