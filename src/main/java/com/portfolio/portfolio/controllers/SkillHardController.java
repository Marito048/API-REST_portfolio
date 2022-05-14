package com.portfolio.portfolio.controllers;
import java.util.ArrayList;
import com.portfolio.portfolio.models.SkillHardModel;
import com.portfolio.portfolio.services.SkillHardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hard")
public class SkillHardController {
    @Autowired
    SkillHardService skillHardService;

    @GetMapping("/get")
    @ResponseBody
    public ArrayList<SkillHardModel> obtenerSkillHard(){
        return skillHardService.obtenerSkillHard();
    }
    @GetMapping("/get/{id_duras}")
    @ResponseBody
    public ResponseEntity<SkillHardModel> obtenerSkillHardPorId(@PathVariable Integer id_duras){
        return skillHardService.obtenerSkillHardPorId(id_duras);
    }
    @PostMapping("/new")
    public void guardarSkillHard(@RequestBody SkillHardModel skillHardModel){
        skillHardService.guardarSkillHard(skillHardModel);
    }
    @PutMapping("/update")
    public void modificarSkillHard(@RequestBody SkillHardModel skillHardModel){
        skillHardService.guardarSkillHard(skillHardModel);
    }
    @DeleteMapping("/delete/{id_duras}")
    public void eliminarSkillHard(@PathVariable Integer id_duras){
        skillHardService.eliminarSkillHard(id_duras);
    }
    
}
