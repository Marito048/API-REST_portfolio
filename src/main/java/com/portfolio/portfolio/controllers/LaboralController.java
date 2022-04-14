package com.portfolio.portfolio.controllers;

import java.util.ArrayList;

import com.portfolio.portfolio.models.LaboralModel;
import com.portfolio.portfolio.services.LaboralService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/laboral")
public class LaboralController {
    @Autowired
    LaboralService laboralService;

    @GetMapping()
    public ArrayList<LaboralModel> obtenerLaboral(){
        return laboralService.obtenerLaboral();
        
    
    }
    @PostMapping()
    public LaboralModel guardarLaboral(LaboralModel laboral){
        return laboralService.guardarLaboral(laboral);
    }    
    
}


