package com.example.sportyshoes.dao;

import com.example.sportyshoes.model.Cart;
import com.example.sportyshoes.model.OrderDetails;
import com.example.sportyshoes.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;



public class OrdersDaoImpl implements OrdersDaoCustom {

    @Autowired
    CartDao cartDao;

    @Autowired
    OrderDetailsDao orderDetailsDao;


    @Autowired
    OrdersDao ordersDao;

    @Override
    public List<Orders> getAllOrders() {
        List<Orders> allOrdersData = (List<Orders>) ordersDao.findAll();
        return allOrdersData;
    }

    @Override
    public int placeOrder(String lid) {
        Calendar calendar = Calendar.getInstance();
        Date currentTime = calendar.getTime();

        Orders orders=new Orders();
        orders.setLoginId(lid);
        orders.setOrderDate(currentTime);

        Orders saveOrder = ordersDao.save(orders);

        int ordid=0;

        List<Cart> cartitems = cartDao.getUserCartItems(lid);
        for (Cart bycartitem : cartitems) {
            OrderDetails orderDetails =new OrderDetails();
            orderDetails.setBrandName(bycartitem.getBrandName());
            orderDetails.setOrderId(saveOrder.getId());
            orderDetails.setPrice(bycartitem.getPrice());
            orderDetails.setGender(bycartitem.getGender());
            orderDetails.setLoginId(lid);
            orderDetails.setSize(bycartitem.getSize());
            orderDetails.setCiId(bycartitem.getId());
            orderDetails.setProductId(bycartitem.getProductId());
            orderDetails.setOrderDate(currentTime);


            OrderDetails orderDetails1 = orderDetailsDao.save(orderDetails);


        }
        return saveOrder.getId();
    }

    @Override
    public int getUserOrderTotal(int ordid) {
        List<OrderDetails> userorderData = orderDetailsDao.findByOrderId(ordid);
        int userordertotal = 0;
        for (OrderDetails ord : userorderData) {
            userordertotal = userordertotal + ord.getPrice();
        }
        return userordertotal;
    }
}

