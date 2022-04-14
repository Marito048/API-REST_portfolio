package com.portfolio.portfolio.services;

import java.util.ArrayList;

import javax.websocket.server.ServerEndpoint;

import com.portfolio.portfolio.models.LaboralModel;
import com.portfolio.portfolio.repositories.LaboralRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service


public class LaboralService {
    @Autowired
    LaboralRepository laboralRepository;

    public ArrayList<LaboralModel> obtenerLaboral(){
        return (ArrayList<LaboralModel>)laboralRepository.findAll();
        
    }
    public LaboralModel guardarLaboral(LaboralModel laboral){
        return laboralRepository.save(laboral);
    }
    
}
