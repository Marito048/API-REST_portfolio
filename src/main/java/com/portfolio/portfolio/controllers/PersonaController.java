package com.portfolio.portfolio.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import com.portfolio.portfolio.models.PersonaModel;
import com.portfolio.portfolio.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping()
    public ArrayList<PersonaModel> obtenerUsuarios(){
        return personaService.obtenerUsuarios();
        
    
    }
    @PostMapping()
    public PersonaModel guardarUsuario(PersonaModel usuario){
        return personaService.guardarUsuario(usuario);
    }    
    
}
