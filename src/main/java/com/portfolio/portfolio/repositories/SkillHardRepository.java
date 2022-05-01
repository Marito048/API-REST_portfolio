package com.portfolio.portfolio.repositories;

import com.portfolio.portfolio.models.SkillHardModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillHardRepository extends JpaRepository<SkillHardModel, Long> {

}
    

