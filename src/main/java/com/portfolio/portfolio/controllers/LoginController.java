package com.portfolio.portfolio.controllers;

import java.util.ArrayList;

import com.portfolio.portfolio.models.LoginModel;
import com.portfolio.portfolio.services.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    LoginService loginService;
    
    @GetMapping("/get")
    @ResponseBody
    public ArrayList<LoginModel> obtenerLogin(){
        return loginService.obtenerLogin();
    }
    @PostMapping("/form")
    public void crearLogin(@RequestBody LoginModel login){
         loginService.crearLogin(login);
    }
    @PutMapping("/update")
    public void modificarLogin(@RequestBody LoginModel login){
        loginService.guardarLogin(login);
            
    }    
    @DeleteMapping("/delete/{id_login}")
    public void borrarLogin(@PathVariable Long id_login){
        loginService.eliminarLogin(id_login);
            
    } 
    
    
}
