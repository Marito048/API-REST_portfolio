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
    @ResponseBody
    public ArrayList<InteresModel> obtenerInteres(){
        return interesService.obtenerInteres();
    }
    @PostMapping("/new")
    public void crearInteres(@RequestBody InteresModel interes){
         interesService.guardarInteres(interes);
    }
    @PutMapping("/update")
    public void modificarInteres(@RequestBody InteresModel interes){
         interesService.crearInteres(interes);
    }
    @DeleteMapping("/delete/{id_Interes}")
    public void borrrarInteres (@PathVariable Long id_Interes){
        interesService.eliminarInteres(id_Interes);
    }
}
// Language: java

