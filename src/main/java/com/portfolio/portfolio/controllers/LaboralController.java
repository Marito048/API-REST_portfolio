package com.portfolio.portfolio.controllers;
import java.util.ArrayList;
import com.portfolio.portfolio.models.LaboralModel;
import com.portfolio.portfolio.services.LaboralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/laboral")
public class LaboralController {
    @Autowired
    LaboralService laboralService;

    @GetMapping("/get")
    public ArrayList<LaboralModel> obtenerLaburo(){
        return laboralService.obtenerLaburo();
        
    }
    
    @PostMapping("/new")
    public void  crearLaburo(@RequestBody LaboralModel laboral){
         laboralService.guardarLaburo(laboral);
    }

    @PutMapping("/update")
    public void  modificarLaburo(LaboralModel laboral){
         laboralService.crearLaburo(laboral);

    }    
    
    @DeleteMapping("/delete/{id_laboral}")
    public void  borrrarLaburo (@PathVariable Long id_laboral){
        laboralService.eliminarLaburo(id_laboral);

    }
}


