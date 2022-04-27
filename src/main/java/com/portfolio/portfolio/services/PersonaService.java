package com.portfolio.portfolio.services;
import java.util.ArrayList;
import com.portfolio.portfolio.models.PersonaModel;
import com.portfolio.portfolio.repositories.PersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 


public class PersonaService {
    @Autowired
    PersonaRepository personaRepository;

    
    public ArrayList<PersonaModel> obtenerPersona(){
        return (ArrayList<PersonaModel>)personaRepository.findAll();
        
    }
    public void crearPersona(PersonaModel persona){
        personaRepository.save(persona);
    }
    public void  guardarPersona(PersonaModel persona){
        personaRepository.save(persona);
    }
    public void  eliminarPersona(Long id_persona){
         personaRepository.deleteById(id_persona);
    }

}
