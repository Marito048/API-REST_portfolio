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
    public ArrayList<PersonaModel> obtenerUsuarios(){
        return personaService.obtenerUsuarios();
        
    
    }
   
    @PostMapping("/crear")
    public void crearUsuario(@RequestBody PersonaModel persona){
        personaService.crearUsuario(persona);
            
    }    
    @PutMapping("/modificar")
    public void modificarUsuario(@RequestBody PersonaModel persona){
        personaService.crearUsuario(persona);
            
    }    
    @DeleteMapping("/borrar/{id_persona}")
    public void borrarUsuario(@PathVariable Long id_persona){
        personaService.eliminarUsuario(id_persona);
            
    } 
     
}
