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

    public ArrayList<SkillHardModel> obtenerSkill(){
        return (ArrayList<SkillHardModel>) skillHardRepository.findAll();
    }
    public void crearSkill (SkillHardModel skill){
        skillHardRepository.save(skill);
    }
    public void guardarSkill (SkillHardModel skill){
        skillHardRepository.save(skill);
    }
    public void borrarSkill (Long id_duras){
        skillHardRepository.deleteById(id_duras);
    }

    
}
