package com.portfolio.portfolio.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hard")
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
    @DeleteMapping("/delete/{id_duras}")
    public void borrarSkill(@PathVariable Long id_skill){
        skillSoftService.eliminarSkill(id_skill);
            
    } 
     
}
