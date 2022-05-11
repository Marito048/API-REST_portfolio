package com.portfolio.portfolio.services;

import java.util.ArrayList;

import com.portfolio.portfolio.models.CertificadosModel;
import com.portfolio.portfolio.repositories.CertificadosRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CertificadosService {
    @Autowired
    CertificadosRepository certificadosRepository;
    public ArrayList<CertificadosModel> obtenerCertificados(){
        return (ArrayList<CertificadosModel>)certificadosRepository.findAll();
    }
    public void crearCertificados(CertificadosModel certificados){
        certificadosRepository.save(certificados);
    }
    public void  guardarCertificados(CertificadosModel certificados){
        certificadosRepository.save(certificados);
    }
    public void  eliminarCertificados (Integer id_certificados){
         certificadosRepository.deleteById(id_certificados);
    }
    
    

    
}
