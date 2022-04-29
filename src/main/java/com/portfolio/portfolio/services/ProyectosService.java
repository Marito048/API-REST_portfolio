package com.portfolio.portfolio.services;
import java.util.ArrayList;
import com.portfolio.portfolio.models.ProyectosModel;
import com.portfolio.portfolio.repositories.ProyectosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectosService {
    @Autowired
    ProyectosRepository proyectosRepository;

    public ArrayList<ProyectosModel> obtenerProyectos(){
        return (ArrayList<ProyectosModel>)proyectosRepository.findAll();
    }

    
}
