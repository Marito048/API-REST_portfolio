package com.portfolio.portfolio.services;

import java.util.ArrayList;

import com.portfolio.portfolio.models.PersonaModel;
import com.portfolio.portfolio.repositories.PersonaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 


public class PersonaService {
    @Autowired
    PersonaRepository usuarioRepository;

    
    public ArrayList<PersonaModel> obtenerPersona(){
        return (ArrayList<PersonaModel>)usuarioRepository.findAll();
        
    }
    public void crearPersona(PersonaModel persona){
        usuarioRepository.save(persona);
    }
    public void  guardarPersona(PersonaModel persona){
        usuarioRepository.save(persona);
    }
    public void  eliminarPersona(Long id_persona){
         usuarioRepository.deleteById(id_persona);
    }

}
