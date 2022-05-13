package com.portfolio.portfolio.services;
import java.util.ArrayList;

import com.portfolio.portfolio.models.SkillHardModel;
import com.portfolio.portfolio.repositories.SkillHardRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SkillHardService {
    @Autowired
     SkillHardRepository skillHardRepository;

    public ArrayList<SkillHardModel> obtenerSkillHard(){
        return (ArrayList<SkillHardModel>)skillHardRepository.findAll();
    }
    public SkillHardModel obtenerSkillHardPorId(int id){
        return skillHardRepository.findById(id).get();
    }
    public void guardarSkillHard(SkillHardModel skillHardModel){
        skillHardRepository.save(skillHardModel);
    }
    public void eliminarSkillHard(int id){
        skillHardRepository.deleteById(id);
    }
    

        
    

}
