package com.example.sportyshoes.service;

import com.example.sportyshoes.model.OrderDetails;


import java.util.Date;
import java.util.List;

public interface OrderDetailsService {
    public List<OrderDetails> getUserOrderDetails(int ordid);

    public List<OrderDetails> getPurchaseReport(String rbrand, Date rdate);
}

