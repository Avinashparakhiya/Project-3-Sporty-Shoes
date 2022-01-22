package com.example.sportyshoes.dao;

import com.example.sportyshoes.model.Users;
import org.apache.catalina.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersDao extends CrudRepository<Users, Integer>,UsersDaoCustom {


    Users findAllByLoginId(String lid);

    Users findByLoginId(String lid);
}

