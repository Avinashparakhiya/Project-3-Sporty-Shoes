package com.example.sportyshoes.dao;


import com.example.sportyshoes.model.Products;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsDao extends CrudRepository<Products, Integer>,ProductsDaoCustom {


}
