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
    @PostMapping("/post")
    
    public void guardarProyecto(@RequestBody ProyectosModel proyectosModel){
         proyectosService.guardarProyectos(proyectosModel);
          
    }
    @PutMapping("/put/{id_Proyectos}")
    
    public void actualizarProyectos(@PathVariable Long id_Proyectos, @RequestBody ProyectosModel proyectosModel){
        proyectosService.guardarProyectos(proyectosModel);
    }
    @DeleteMapping("/delete/{id_Proyectos}")
    
    public void eliminarProyectos(@PathVariable Long id_Proyectos){
        proyectosService.eliminarProyectos(id_Proyectos);
    }

    
}

