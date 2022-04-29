package com.portfolio.portfolio.controllers;

import java.util.ArrayList;

import com.portfolio.portfolio.models.InteresModel;
import com.portfolio.portfolio.services.InteresService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/interes")
public class InteresController {
    @Autowired
    InteresService interesService;
    
    @GetMapping("/get")
    @ResponseBody
    public ArrayList<InteresModel> obtenerInteres(){
        return interesService.obtenerInteres();

    }


    
}
