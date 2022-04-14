package com.portfolio.portfolio.services;

import java.util.ArrayList;

import com.portfolio.portfolio.models.EducacionModel;
import com.portfolio.portfolio.repositories.EducacionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EducacionService {
    @Autowired
    EducacionRepository educacionRepository;
    
    public ArrayList<EducacionModel> obtenerEstudios(){
        return (ArrayList<EducacionModel>)educacionRepository.findAll();
        
    }
    public EducacionModel guardarEstudios(EducacionModel educacion){
        return educacionRepository.save(educacion);
    }

    
}
