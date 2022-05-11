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
    public void crearSkillHard(SkillHardModel skillHard){
        skillHardRepository.save(skillHard);
    }
    public void  guardarSkillHard(SkillHardModel skillHard){
        skillHardRepository.save(skillHard);
    }
    public void  eliminarSkillHard(Integer id_skillHard){
        skillHardRepository.deleteById(id_skillHard);
    }
    
    
}

