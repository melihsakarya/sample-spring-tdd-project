package com.testinium.sample.tdd.service.impl;

import com.testinium.sample.tdd.entity.Product;
import com.testinium.sample.tdd.repository.ProductRepository;
import com.testinium.sample.tdd.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.BufferedReader;
import java.io.FileReader;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product getById(Long id) {
        return productRepository.findById(id).get();
    }


    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }


}
