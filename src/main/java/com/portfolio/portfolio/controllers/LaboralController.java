package com.portfolio.portfolio.controllers;

import java.util.ArrayList;

import com.portfolio.portfolio.models.LaboralModel;
import com.portfolio.portfolio.services.LaboralService;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/laboral")
public class LaboralController {
    @Autowired
    LaboralService laboralService;

    @GetMapping()
    public ArrayList<LaboralModel> obtenerLaburo(){
        return laboralService.obtenerLaburo();
        
    
    }
    @PostMapping()
    public LaboralModel guardarLaburo(LaboralModel laboral){
        return laboralService.guardarLaburo(laboral);
    }    
    
}


