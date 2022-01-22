package com.example.sportyshoes.dao;

import com.example.sportyshoes.model.Cart;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class CartDaoImpl  implements CartDaoCustom{

    @Autowired
    private CartDao cartDao;

    @Override
    public List<Cart> getAllCartItems() {
        List<Cart> allcartsData = (List<Cart>) cartDao.findAll();
        return allcartsData;
    }

    @Override
    public boolean addItemToCart(int pid, String lid, int pr, String bn, String gd, int sz) {
        boolean flag = false;
//        List<Cart> getallcartitems = getAllCartItems();
//        int i = 1;
//        for (Cart countcartitem : getallcartitems) {
//            int cartid = countcartitem.getId();
//            if (cartid >= i) {
//                i = cartid;
//                i++;
//            }
//        }
        Cart cart=new Cart();
        cart.setProductId(pid);
        cart.setLoginId(lid);
        cart.setPrice(pr);
        cart.setBrandName(bn);
        cart.setGender(gd);
        cart.setSize(sz);

        Cart c = cartDao.save(cart);

        if (c!=null)
            flag = true;
        return flag;
    }

    @Override
    public List<Cart> getUserCartItems(String lid) {
        List<Cart> usercartitems = cartDao.findByLoginId(lid);
        return usercartitems;
    }

    @Override
    public int getUserCartTotal(String lid) {
        List<Cart> usercartitems = cartDao.findByLoginId(lid);

        int usercarttotal = 0;
        for (Cart cart : usercartitems) {
            usercarttotal = usercarttotal + cart.getPrice();
        }
        return usercarttotal;
    }

}


