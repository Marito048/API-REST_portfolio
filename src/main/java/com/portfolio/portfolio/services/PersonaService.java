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

    public ArrayList<PersonaModel> obtenerUsuarios(){
        return (ArrayList<PersonaModel>)usuarioRepository.findAll();
        
    }
    public void crearUsuario(PersonaModel persona){
        usuarioRepository.save(persona);
    }
    public void  guardarUsuario(PersonaModel persona){
        usuarioRepository.save(persona);
    }
    public void  eliminarUsuario(Long id_persona){
         usuarioRepository.deleteById(id_persona);
    }

}
