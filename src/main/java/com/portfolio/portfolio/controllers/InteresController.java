package com.portfolio.portfolio.controllers;
import java.util.ArrayList;
import com.portfolio.portfolio.models.InteresModel;
import com.portfolio.portfolio.services.InteresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/interes")
public class InteresController {
    @Autowired
    InteresService interesService;
    
    @GetMapping("/get")
    public ArrayList<InteresModel> obtenerInteres(){
        return interesService.obtenerInteres();
    }

    @PostMapping("/new")
    public void  crearInteres(@RequestBody InteresModel interes){
         interesService.guardarInteres(interes);
    }

    @PutMapping("/update")
    public void  modificarInteres(@RequestBody InteresModel laboral){
         interesService.crearInteres(laboral);

    }    
    
    @DeleteMapping("/delete/{id_interes}")
    public void  borrrarLaburo (@PathVariable Long id_interes){
        interesService.eliminarInteres(id_interes);

    }
    

    
}
