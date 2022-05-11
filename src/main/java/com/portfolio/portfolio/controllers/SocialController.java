package com.portfolio.portfolio.controllers;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import com.portfolio.portfolio.models.SocialModel;
import com.portfolio.portfolio.services.SocialService;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/social")
public class SocialController {
    @Autowired
    SocialService socialService;

    @GetMapping("/get")
    @ResponseBody
    public ArrayList<SocialModel> obtenerSocial(){
        return socialService.obtenerSocial();
       
    }
    @PostMapping("/new")
    public void crearSocial(@RequestBody SocialModel social){
        socialService.crearSocial(social);
            
    }    
    @PutMapping("/update")
    public void modificarSocial(@RequestBody SocialModel social){
        socialService.crearSocial(social);
            
    }    
    @DeleteMapping("/delete/{id_social}")
    public void borrarSocial(@PathVariable Integer id_social){
        socialService.eliminarSocial(id_social);
            
    } 
     
}
