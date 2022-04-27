package com.portfolio.portfolio.services;
import java.util.ArrayList;
import com.portfolio.portfolio.models.SocialModel;

import com.portfolio.portfolio.repositories.SocialRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 


public class SocialService {
    @Autowired
    SocialRepository socialRepository;

    
    public ArrayList<SocialModel> obtenerSocial(){
        return (ArrayList<SocialModel>)socialRepository.findAll();
        
    }
    public void crearSocial(SocialModel social){
        socialRepository.save(social);
    }
    public void  guardarSocial(SocialModel social){
        socialRepository.save(social);
    }
    public void  eliminarSocial(Long id_social){
         socialRepository.deleteById(id_social);
    }

}