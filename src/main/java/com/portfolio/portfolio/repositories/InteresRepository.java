package com.portfolio.portfolio.repositories;
import com.portfolio.portfolio.models.InteresModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface InteresRepository extends JpaRepository<InteresModel, Long> {

}

