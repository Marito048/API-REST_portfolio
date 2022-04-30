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
    public void crearSkill (SkillSoftModel skill){
        skillSoftService.crearSkill(skill);
    }
    @PutMapping("/update")
    public void modificarSkill (SkillSoftModel skill){
        skillSoftService.guardarSkill(skill);
    }
    @DeleteMapping("/delete/{id_duras}")
    public void borrrarSkill (@PathVariable Long id_duras){
        skillSoftService.borrarSkill(id_duras);
    }

     
}
