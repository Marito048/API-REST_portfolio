package com.portfolio.portfolio.services;

import java.util.ArrayList;
import com.portfolio.portfolio.models.LaboralModel;
import com.portfolio.portfolio.repositories.LaboralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service


public class LaboralService {
    @Autowired
    LaboralRepository laboralRepository;

    public ArrayList<LaboralModel> obtenerLaburo(){
        return (ArrayList<LaboralModel>)laboralRepository.findAll();
        
    }
    public void crearLaburo(LaboralModel laboral){
        laboralRepository.save(laboral);
    } 
    public void guardarLaburo(LaboralModel laboral){
        laboralRepository.save(laboral);
    } 

    
    public void  eliminarLaburo (Long id_laboral){
         laboralRepository.deleteById(id_laboral);
    }
}
    

