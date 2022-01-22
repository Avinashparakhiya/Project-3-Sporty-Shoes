package com.example.sportyshoes.dao;

import com.example.sportyshoes.model.Cart;

import java.util.List;

public interface CartDaoCustom {
    List<Cart> getAllCartItems();

    boolean addItemToCart(int pid, String lid, int pr, String bn, String gd, int sz);

    List<Cart> getUserCartItems(String lid);

    int getUserCartTotal(String lid);
}
