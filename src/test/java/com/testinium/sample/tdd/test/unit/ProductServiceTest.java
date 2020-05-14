package com.testinium.sample.tdd.test.unit;

import com.testinium.sample.tdd.entity.Product;
import com.testinium.sample.tdd.repository.ProductRepository;
import com.testinium.sample.tdd.service.ProductService;
import com.testinium.sample.tdd.service.impl.ProductServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProductServiceTest {

    @InjectMocks
    ProductServiceImpl productService;

    @Mock
    ProductRepository productRepository;

    @Test
    public void saveProductTest(){
        Product product = new Product();
        product.setName("Iphone");

        productService.save(product);
    }
}
