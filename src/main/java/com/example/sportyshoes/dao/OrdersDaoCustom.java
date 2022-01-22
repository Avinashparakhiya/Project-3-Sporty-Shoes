package com.example.sportyshoes.dao;

import com.example.sportyshoes.model.Orders;

import java.util.List;

public interface OrdersDaoCustom {
    public List<Orders> getAllOrders();

    public int placeOrder(String lid);

    public int getUserOrderTotal(int ordid);
}
