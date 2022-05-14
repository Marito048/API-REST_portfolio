package com.portfolio.portfolio.services;
import java.util.ArrayList;
import java.util.Optional;

import com.portfolio.portfolio.models.SkillHardModel;
import com.portfolio.portfolio.repositories.SkillHardRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class SkillHardService {
    @Autowired
     SkillHardRepository skillHardRepository;

    public ArrayList<SkillHardModel> obtenerSkillHard(){
        return (ArrayList<SkillHardModel>)skillHardRepository.findAll();
    }
    public ResponseEntity<SkillHardModel> obtenerSkillHardPorId(int id){
        
            Optional<SkillHardModel> skill = skillHardRepository.findById(id);
    
            if (skill.isPresent()) {
                return ResponseEntity.ok().body(skill.get());
            } else {
                return ResponseEntity.notFound().build();
            }
        }
        
    
    public void guardarSkillHard(SkillHardModel skillHardModel){
        skillHardRepository.save(skillHardModel);
    }
    public void eliminarSkillHard(int id){
        skillHardRepository.deleteById(id);
    }
}



        
    


