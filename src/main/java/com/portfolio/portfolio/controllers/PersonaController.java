package com.portfolio.portfolio.controllers;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import com.portfolio.portfolio.models.PersonaModel;
import com.portfolio.portfolio.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping("/get")
    @ResponseBody
    public ArrayList<PersonaModel> obtenerPersona(){
        return personaService.obtenerPersona();
       
    }
   
    @PostMapping("/new")
    public void crearPersona(@RequestBody PersonaModel persona){
        personaService.crearPersona(persona);
            
    }    
    @PutMapping("/update")
    public void modificarPersona(@RequestBody PersonaModel persona){
        personaService.crearPersona(persona);
            
    }    
    @DeleteMapping("/delete/{id_persona}")
    public void borrarPersona(@PathVariable Long id_persona){
        personaService.eliminarPersona(id_persona);
            
    } 
     
}
