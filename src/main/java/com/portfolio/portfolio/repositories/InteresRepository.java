package com.portfolio.portfolio.repositories;

import javax.persistence.Table;

import com.portfolio.portfolio.models.InteresModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Table(name = "interes")
public interface InteresRepository extends CrudRepository<InteresModel, Integer> {

}

