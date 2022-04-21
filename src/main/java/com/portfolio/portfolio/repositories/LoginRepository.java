package com.portfolio.portfolio.repositories;

import com.portfolio.portfolio.models.LoginModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface LoginRepository extends CrudRepository <LoginModel, Long > {

}
    

