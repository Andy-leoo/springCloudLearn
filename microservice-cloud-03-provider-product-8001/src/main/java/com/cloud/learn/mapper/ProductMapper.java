package com.cloud.learn.mapper;


import com.cloud.learn.bean.Product;

import java.util.List;

public interface ProductMapper {

    Product findById(Long pid);
    List<Product> findAll();
    boolean addProduct(Product product);
}
