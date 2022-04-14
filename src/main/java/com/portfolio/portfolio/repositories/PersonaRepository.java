package com.portfolio.portfolio.repositories;

import com.portfolio.portfolio.models.PersonaModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface PersonaRepository extends CrudRepository<PersonaModel, Integer> {


}
    

