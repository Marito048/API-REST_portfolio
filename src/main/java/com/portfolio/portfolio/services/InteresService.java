package com.portfolio.portfolio.services;
import java.util.ArrayList;
import com.portfolio.portfolio.models.InteresModel;
import com.portfolio.portfolio.repositories.InteresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InteresService {
    @Autowired
    InteresRepository interesRepository;
    public ArrayList<InteresModel> obtenerInteres(){
        return (ArrayList<InteresModel>)interesRepository.findAll();
    }
    public InteresModel guardarInteres(InteresModel interes){
        return interesRepository.save(interes);
    }
    
}

