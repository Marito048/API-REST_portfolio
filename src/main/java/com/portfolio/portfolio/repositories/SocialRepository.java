package com.portfolio.portfolio.repositories;
import com.portfolio.portfolio.models.SocialModel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface SocialRepository extends JpaRepository <SocialModel, Long> {


}