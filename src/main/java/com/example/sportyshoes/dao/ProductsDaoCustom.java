package com.example.sportyshoes.dao;

import com.example.sportyshoes.model.Products;

import java.util.List;

public interface ProductsDaoCustom {
    public List<Products> getAllProducts();

    public Products getProduct(int pid);

    public boolean updateProduct(int pid, String bn, String gd, int size, int price);

    public boolean addProduct(Products product);

}
