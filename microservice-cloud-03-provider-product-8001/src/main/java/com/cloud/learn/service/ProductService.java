package com.cloud.learn.service;

import com.cloud.learn.bean.Product;

import java.util.List;

public interface ProductService {

    boolean add(Product product);
    Product get(Long id);
    List<Product> list();
}
