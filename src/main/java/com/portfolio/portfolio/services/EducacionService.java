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
    
    public ArrayList<EducacionModel> obtenerInteres(){
        return (ArrayList<EducacionModel>)educacionRepository.findAll();
        
    }
    public void crearInteres(EducacionModel educacion){
        educacionRepository.save(educacion);
    } 
    public void guardarInteres(EducacionModel educacion){
        educacionRepository.save(educacion);
    } 

    
    public void  eliminarInteres (Long id_educacion){
         educacionRepository.deleteById(id_educacion);
    }

    
}
