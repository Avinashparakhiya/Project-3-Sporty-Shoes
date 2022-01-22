package com.example.sportyshoes.service;

import com.example.sportyshoes.dao.OrdersDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrdersService {

    @Autowired
    OrdersDao ordersDao;

    @Override
    public int placeOrder(String lid) {
        return ordersDao.placeOrder(lid);
    }

    @Override
    public int getUserOrderTotal(int ordid) {
        return ordersDao.getUserOrderTotal(ordid);
    }

}

