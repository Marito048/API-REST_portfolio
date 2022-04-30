package com.portfolio.portfolio.controllers;

import java.util.ArrayList;

import com.portfolio.portfolio.models.SkillHardModel;
import com.portfolio.portfolio.repositories.SkillHardRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hard")
public class SkillHardController {
    @Autowired
    SkillHardRepository skillHardRepository;

    @GetMapping("/get")
    @ResponseBody
    public ArrayList<SkillHardModel> obtenerSkillHard(){
        return (ArrayList<SkillHardModel>)skillHardRepository.findAll();

    
    }
    @PostMapping("/new")
    public void crearSkillHard(@RequestBody SkillHardModel skillHard){
            skillHardRepository.save(skillHard);
    }
    @PutMapping("/update")
    public void modificarSkillHard(@RequestBody SkillHardModel skillHard){
            skillHardRepository.save(skillHard);
    }
    @DeleteMapping("/delete/{id_SkillHard}")
    public void borrarSkillHard(@PathVariable Long id_SkillHard){
        skillHardRepository.deleteById(id_SkillHard);
    }
    
}

