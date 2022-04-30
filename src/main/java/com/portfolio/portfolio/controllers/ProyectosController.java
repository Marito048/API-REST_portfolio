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
    @PostMapping("/new")
    public void crearProyectos(@RequestBody ProyectosModel proyectos){
         proyectosService.guardarProyectos(proyectos);
          
    }
    @PutMapping("/update")
    public void modificarProyectos(@RequestBody ProyectosModel proyectos){
         proyectosService.guardarProyectos(proyectos);
        
    }
    @DeleteMapping("/delete/{id_Proyectos}")
    public void borrarProyectos(@PathVariable Long id_Proyectos){
        proyectosService.eliminarProyectos(id_Proyectos);
    }

    
}

