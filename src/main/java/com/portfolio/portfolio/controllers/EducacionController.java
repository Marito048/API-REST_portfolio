package com.portfolio.portfolio.controllers;

import java.util.ArrayList;

import com.portfolio.portfolio.models.EducacionModel;
import com.portfolio.portfolio.services.EducacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/educacion")
public class EducacionController {
    @Autowired
    EducacionService educacionService;

    @GetMapping("/get")
    public ArrayList<EducacionModel> obtenerEducacion(){
        return educacionService.obtenerEducacion();
    }

    @PostMapping("/new")
    public void  crearEducacion(@RequestBody EducacionModel educacion){
         educacionService.guardarEducacion(educacion);
    }

    @PutMapping("/update")
    public void  modificarEducacion(@RequestBody EducacionModel educacion){
         educacionService.crearEducacion(educacion);

    }    
    
    @DeleteMapping("/delete/{id_Educacion}")
    public void  borrrarEducacion (@PathVariable Long id_educacion){
        educacionService.eliminarEducacion(id_educacion);

    }
    
}

