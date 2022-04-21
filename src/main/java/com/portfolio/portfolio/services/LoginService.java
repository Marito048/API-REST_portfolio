package com.portfolio.portfolio.services;

import java.util.ArrayList;

import com.portfolio.portfolio.models.LoginModel;
import com.portfolio.portfolio.repositories.LoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    LoginRepository loginRepository;
    public ArrayList<LoginModel> obtenerLogin(){
        return (ArrayList<LoginModel>)loginRepository.findAll();
    }
    
    public void crearLogin(LoginModel login){
        loginRepository.save(login);
    }
    public void guardarLogin(LoginModel login){
         loginRepository.save(login);
    }
    
    public void  eliminarLogin(Long id_login){
         loginRepository.deleteById(id_login);
    }

    

    
    
}
