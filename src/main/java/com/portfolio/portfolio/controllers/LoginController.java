package com.portfolio.portfolio.controllers;

import java.util.ArrayList;

import com.portfolio.portfolio.models.LoginModel;
import com.portfolio.portfolio.services.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginService loginService;
    @GetMapping("/obtener")
    public ArrayList<LoginModel> obtenerLogin(){
        return loginService.obtenerLogin();
    }
    @PostMapping("/crear")
    public LoginModel guardarLogin(LoginModel login){
        return loginService.guardarLogin(login);
    }
    
    
}
