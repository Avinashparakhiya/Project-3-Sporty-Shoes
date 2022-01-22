package com.example.sportyshoes.service;

import com.example.sportyshoes.dao.OrderDetailsDao;
import com.example.sportyshoes.model.OrderDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


@Service
public class OrderDetailsServiceImpl implements OrderDetailsService {

    @Autowired
    OrderDetailsDao orderDetailsDao;

    @Override
    public List<OrderDetails> getUserOrderDetails(int ordid) {
        return orderDetailsDao.getUserOrderDetails(ordid);
    }

    @Override
    public List<OrderDetails> getPurchaseReport(String rbrand, Date rdate) {
        return orderDetailsDao.getPurchaseReport(rbrand, rdate);
    }

}

