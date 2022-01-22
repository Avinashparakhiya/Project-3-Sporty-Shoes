package com.example.sportyshoes.service;

import com.example.sportyshoes.model.Products;

import java.util.List;

public interface ProductsService {
    public List<Products> getAllProducts();

    public Products getProduct(int pid);

    public boolean updateProduct(int pid, String bn, String gd, int sz, int pr);

    public boolean addProduct(Products product);
}
