package com.example.sportyshoes.dao;

import com.example.sportyshoes.model.OrderDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.Date;
import java.util.List;

@Repository
public interface OrderDetailsDao extends CrudRepository<OrderDetails, Integer> , OrderDetailsDaoCustom {

    List<OrderDetails> findByOrderId(int ordid);

    List<OrderDetails> findByBrandNameAndOrderDate(String rbrand, Date rdate);
}

