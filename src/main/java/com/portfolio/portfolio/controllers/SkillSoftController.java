package com.portfolio.portfolio.controllers;
import java.util.ArrayList;

import com.portfolio.portfolio.models.SkillSoftModel;
import com.portfolio.portfolio.services.SkillSoftService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/soft")
public class SkillSoftController {
    @Autowired
    SkillSoftService skillSoftService;

    @GetMapping("/get")
    @ResponseBody
    public ArrayList<SkillSoftModel> obtenerSkill(){
        return skillSoftService.obtenerSkill();
       
    }
   
    @PostMapping("/new")
    public void crearSkill(@RequestBody SkillSoftModel skill){
        skillSoftService.crearSkill(skill);
            
    }    
    @PutMapping("/update")
    public void modificarSkill(@RequestBody SkillSoftModel skill){
        skillSoftService.crearSkill(skill);
            
    }    
    @DeleteMapping("/delete/{id_blandas}")
    public void borrarSkill(@PathVariable Long id_blandas){
        skillSoftService.borrarSkill(id_blandas);
            
    } 
     
}
