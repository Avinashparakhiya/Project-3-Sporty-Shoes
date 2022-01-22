package com.example.sportyshoes.service;

import com.example.sportyshoes.dao.CartDao;
import com.example.sportyshoes.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CartServiceImpl implements CartService {

    @Autowired
    CartDao cartDao;

    @Override
    public List<Cart> getAllCartItems() {
        return cartDao.getAllCartItems();
    }

    @Override
    public boolean addItemToCart(int pid, String lid, int pr, String bn, String gd, int sz) {
        return cartDao.addItemToCart(pid, lid, pr, bn, gd, sz);
    }

    @Override
    public List<Cart> getUserCartItems(String lid) {
        return cartDao.getUserCartItems(lid);
    }

    @Override
    public int getUserCartTotal(String lid) {
        return cartDao.getUserCartTotal(lid);
    }


}
