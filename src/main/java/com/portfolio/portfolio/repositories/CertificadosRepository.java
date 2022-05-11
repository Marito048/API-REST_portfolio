package com.portfolio.portfolio.repositories;

import com.portfolio.portfolio.models.CertificadosModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository

public interface CertificadosRepository extends JpaRepository<CertificadosModel, Integer> {


    
}
