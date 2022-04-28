package com.portfolio.portfolio.repositories;

import com.portfolio.portfolio.models.LoginModel;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository


public interface LoginRepository extends JpaRepository <LoginModel, Long > {

}
    

