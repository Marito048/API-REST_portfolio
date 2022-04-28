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
    
    public ArrayList<EducacionModel> obtenerEducacion(){
        return (ArrayList<EducacionModel>)educacionRepository.findAll();
        
    }
    public void crearEducacion(EducacionModel educacion){
        educacionRepository.save(educacion);
    } 
    public void guardarEducacion(EducacionModel educacion){
        educacionRepository.save(educacion);
    } 

    
    public void  eliminarEducacion (Long id_educacion){
         educacionRepository.deleteById(id_educacion);
    }

    
}
