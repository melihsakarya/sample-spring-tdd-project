package com.testinium.sample.tdd.service;

import com.testinium.sample.tdd.entity.Product;

public interface ProductService {

    public Product getById(Long id);

    public Product save(Product product);
}
