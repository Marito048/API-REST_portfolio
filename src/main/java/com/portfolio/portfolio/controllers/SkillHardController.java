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
    SkillHardService  skillHardService;

    @GetMapping("/get")
    @ResponseBody
    public ArrayList<SkillHardModel> obtenerSkillHard(){
        return skillHardService.obtenerSkillHard();

    
    }
    @PostMapping("/new")
    public void crearSkillHard(@RequestBody SkillHardModel skillHard){
            skillHardService.crearSkillHard(skillHard);
    }
    @PutMapping("/update")
    public void modificarSkillHard(@RequestBody SkillHardModel skillHard){
            skillHardService.crearSkillHard(skillHard);
    }
    @DeleteMapping("/delete/{id_SkillHard}")
    public void borrarSkillHard(@PathVariable Long id_SkillHard){
        skillHardService.eliminarSkillHard(id_SkillHard);
    }
    
}

