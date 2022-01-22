package com.example.sportyshoes.dao;

import com.example.sportyshoes.model.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartDao extends CrudRepository<Cart,Integer> , CartDaoCustom {


    List<Cart> findByLoginId(String lid);

    void deleteByLoginId(String lid);

    void deleteAllByLoginId(String lid);
}

