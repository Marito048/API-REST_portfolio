package com.portfolio.portfolio.controllers;

import java.util.ArrayList;

import com.portfolio.portfolio.models.CertificadosModel;
import com.portfolio.portfolio.services.CertificadosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/certificados")
public class CertificadosController {
    @Autowired
    CertificadosService certificadosService;

    @GetMapping("/get")
    public ArrayList<CertificadosModel> obtenerCertificados(){
        return certificadosService.obtenerCertificados();
    }
    @PostMapping("/new")
    public void crearCertificados(CertificadosModel certificados){
        certificadosService.crearCertificados(certificados);
    }
    @PutMapping("/update")
    public void modificarCertificados(CertificadosModel certificados){
        certificadosService.crearCertificados(certificados);
    }
    @DeleteMapping("/delete/{id_certificados}")
    public void borrarCertificados(Integer id_certificados){
        certificadosService.eliminarCertificados(id_certificados);
    }
    




}
