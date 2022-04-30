package com.portfolio.portfolio.controllers;
import java.util.ArrayList;

import com.portfolio.portfolio.models.SkillHardModel;
import com.portfolio.portfolio.services.SkillHardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hard")
public class SkillHardController {
    @Autowired
    SkillHardService skillHardService;

    @GetMapping("/get")
    @ResponseBody
    public ArrayList<SkillHardModel> obtenerSkill(){
        return skillHardService.obtenerSkill();
    }
    @PostMapping("/new")
    public void crearSkill (SkillHardModel skill){
        skillHardService.crearSkill(skill);
    }
    @PutMapping("/update")
    public void modificarSkill (SkillHardModel skill){
        skillHardService.guardarSkill(skill);
    }
    @DeleteMapping("/delete/{id_duras}")
    public void borrrarSkill (@PathVariable Long id_duras){
        skillHardService.borrarSkill(id_duras);
    }
    
     
}
