package com.portfolio.portfolio.controllers;
import java.util.ArrayList;
import com.portfolio.portfolio.models.ProyectosModel;
import com.portfolio.portfolio.services.ProyectosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
