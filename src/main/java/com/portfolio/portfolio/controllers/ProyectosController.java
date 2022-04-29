package com.portfolio.portfolio.controllers;

import java.util.ArrayList;

import com.portfolio.portfolio.models.ProyectosModel;
import com.portfolio.portfolio.services.ProyectosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyectos")
public class ProyectosController {
    @Autowired
    ProyectosService proyectosService;
    
    @GetMapping("/get")
    @ResponseBody
    public ArrayList<ProyectosModel> obtenerProyectos(){
        return proyectosService.obtenerProyectos();

    }
    
}
