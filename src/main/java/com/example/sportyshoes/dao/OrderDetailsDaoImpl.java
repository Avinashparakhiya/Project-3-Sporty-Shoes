package com.example.sportyshoes.dao;

import com.example.sportyshoes.model.OrderDetails;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;


public class OrderDetailsDaoImpl implements OrderDetailsDaoCustom {

    @Autowired
    OrderDetailsDao orderDetailsDao;

    @Override
    public List<OrderDetails> getAllOrderDetails() {
        List<OrderDetails> allOrderDetailsData = (List<OrderDetails>) orderDetailsDao.findAll();
        return allOrderDetailsData;
    }

    @Override
    public List<OrderDetails> getUserOrderDetails(int ordid) {
        List<OrderDetails> userOrderDetailsData = orderDetailsDao.findByOrderId(ordid);
        return userOrderDetailsData;
    }

    @Override
    public List<OrderDetails> getPurchaseReport(String rbrand, Date rdate) {
        List<OrderDetails> userPurchaseData = orderDetailsDao.findByBrandNameAndOrderDate(rbrand, rdate);
        return userPurchaseData;
    }
}


