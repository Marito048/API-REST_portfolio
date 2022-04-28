package com.portfolio.portfolio.services;

import java.util.ArrayList;

import com.portfolio.portfolio.models.SkillSoftModel;
import com.portfolio.portfolio.repositories.SkillSoftRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class SkillSoftService {
    @Autowired
    SkillSoftRepository skillSoftRepository;

    public ArrayList<SkillSoftModel> obtenerSkill(){
        return (ArrayList<SkillSoftModel>) skillSoftRepository.findAll();
    }
    public void crearSkill (SkillSoftModel skill){
        skillSoftRepository.save(skill);
    }

    public void guardarSkill (SkillSoftModel skill){
        skillSoftRepository.save(skill);
    }
    public void borrarSkill (Long id_blandas){
        skillSoftRepository.deleteById(id_blandas);
    }

    
}
