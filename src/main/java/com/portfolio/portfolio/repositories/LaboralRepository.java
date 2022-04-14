package com.portfolio.portfolio.repositories;

import com.portfolio.portfolio.models.LaboralModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaboralRepository extends CrudRepository<LaboralModel, Integer> {

}


