package com.portfolio.portfolio.repositories;
import com.portfolio.portfolio.models.EducacionModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EducacionRepository extends CrudRepository<EducacionModel, Integer> {

}
    

