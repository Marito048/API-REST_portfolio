package com.portfolio.portfolio.repositories;
import com.portfolio.portfolio.models.EducacionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EducacionRepository extends JpaRepository<EducacionModel, Integer> {

}
    

