package com.portfolio.portfolio.repositories;

import com.portfolio.portfolio.models.LaboralModel;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface LaboralRepository extends JpaRepository<LaboralModel, Long> {

}


