package com.portfolio.portfolio.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import com.portfolio.portfolio.models.PersonaModel;
import com.portfolio.portfolio.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/persona")
public class PersonaController {
    @Autowired
    PersonaService personaService;

    @GetMapping("/obtener")
    @ResponseBody
    public ArrayList<PersonaModel> obtenerPersona(){
        return personaService.obtenerPersona();
       
    }
   
    @PostMapping("/crear")
    public void crearPersona(@RequestBody PersonaModel persona){
        personaService.crearPersona(persona);
            
    }    
    @PutMapping("/modificar")
    public void modificarPersona(@RequestBody PersonaModel persona){
        personaService.crearPersona(persona);
            
    }    
    @DeleteMapping("/borrar/{id_persona}")
    public void borrarPersona(@PathVariable Long id_persona){
        personaService.eliminarPersona(id_persona);
            
    } 
     
}
