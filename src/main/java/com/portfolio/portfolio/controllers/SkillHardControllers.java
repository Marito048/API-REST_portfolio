package com.portfolio.portfolio.controllers;

import java.util.ArrayList;

import com.portfolio.portfolio.models.SkillHardModel;
import com.portfolio.portfolio.services.SkillHardService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hard")
public class SkillHardControllers {
    @Autowired
    SkillHardService skillHardService;
    
    @GetMapping("/get")
    @ResponseBody
    public ArrayList<SkillHardModel> obtenerSkillHard(){
        return skillHardService.obtenerSkillHard();
    }
    @PutMapping("/update")
    public void modificarSkillHard(SkillHardModel skillHard){
        skillHardService.crearSkillHard(skillHard);
    }
    @PostMapping("/new")
    public void crearSkillHard(SkillHardModel skillHard){
        skillHardService.crearSkillHard(skillHard);
    }
    @DeleteMapping("/delete/{id_skillHard}")
    public void borrarSkillHard(Integer id_skillHard){
        skillHardService.eliminarSkillHard(id_skillHard);
    }

    
}
