package com.portfolio.portfolio.repositories;
import com.portfolio.portfolio.models.PersonaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository <PersonaModel, Long> {


}
    

