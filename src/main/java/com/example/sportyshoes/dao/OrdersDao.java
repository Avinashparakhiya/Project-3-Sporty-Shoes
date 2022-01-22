package com.example.sportyshoes.dao;

import com.example.sportyshoes.model.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersDao extends CrudRepository<Orders, Integer>,OrdersDaoCustom {


    List<Orders> findById(int ordid);
}
