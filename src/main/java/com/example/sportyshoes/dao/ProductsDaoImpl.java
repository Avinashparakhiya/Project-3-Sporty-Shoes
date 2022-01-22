package com.example.sportyshoes.dao;

import com.example.sportyshoes.model.Products;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class ProductsDaoImpl implements ProductsDaoCustom {

    @Autowired
    ProductsDao productsDao;

    @Override
    public List<Products> getAllProducts() {

        List<Products> productsData = (List<Products>) productsDao.findAll();

        return productsData;
    }

    @Override
    public Products getProduct(int pid) {

        return productsDao.findById(pid).get();
    }

    @Override
    public boolean updateProduct(int pid, String bn, String gd, int sz, int pr) {
        Products products = productsDao.findById(pid).get();
        products.setPrice(pr);
        products.setBrandName(bn);
        products.setGender(gd);
        products.setSize(sz);
        products.setPrice(pr);

        productsDao.save(products);

        return true;

    }

    @Override
    public boolean addProduct(Products product) {
        productsDao.save(product);
        return true;
    }


}