package com.example.sportyshoes.dao;

import com.example.sportyshoes.model.OrderDetails;

import java.util.Date;
import java.util.List;

public interface OrderDetailsDaoCustom {
    public List<OrderDetails> getAllOrderDetails();

    public List<OrderDetails> getUserOrderDetails(int ordid);

    public List<OrderDetails> getPurchaseReport(String rbrand, Date rdate);

}
