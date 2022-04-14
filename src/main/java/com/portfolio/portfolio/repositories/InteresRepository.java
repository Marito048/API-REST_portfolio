package com.portfolio.portfolio.repositories;
import com.portfolio.portfolio.models.InteresModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface InteresRepository extends CrudRepository<InteresModel, Integer> {

}

