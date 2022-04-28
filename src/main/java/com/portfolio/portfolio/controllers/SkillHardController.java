package com.portfolio.portfolio.controllers;
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
    public void crearSkill(@RequestBody SkillHardModel skill){
        skillHardService.crearSkill(skill);
            
    }    
    @PutMapping("/update")
    public void modificarSkill(@RequestBody SkillHardModel skill){
        skillHardService.crearPersona(skill);
            
    }    
    @DeleteMapping("/delete/{id_duras}")
    public void borrarSkill(@PathVariable Long id_skill){
        skillHardService.eliminarSkill(id_skill);
            
    } 
     
}
