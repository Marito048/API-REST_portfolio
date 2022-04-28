package com.portfolio.portfolio.repositories;
import com.portfolio.portfolio.models.SkillSoftModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface SkillSoftRepository extends JpaRepository<SkillSoftModel, Long> {
    
}
