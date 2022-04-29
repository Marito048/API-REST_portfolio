package com.portfolio.portfolio.repositories;
import com.portfolio.portfolio.models.ProyectosModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  ProyectosRepository extends JpaRepository<ProyectosModel, Long>{
    
}
