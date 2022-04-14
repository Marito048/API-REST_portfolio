package com.portfolio.portfolio.controllers;

import java.util.ArrayList;

import com.portfolio.portfolio.models.EducacionModel;
import com.portfolio.portfolio.services.EducacionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/educacion")
public class EducacionController {
    @Autowired
    EducacionService educacionService;

    @GetMapping()
    public ArrayList<EducacionModel> obtenerEstudios(){
        return educacionService.obtenerEstudios();
        
    
    }
    @PostMapping()
    public EducacionModel guardarEstudios(EducacionModel educacion){
        return educacionService.guardarEstudios(educacion);
    }    
    
}

