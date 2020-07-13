package com.testinium.sample.tdd.test.integration;

import com.testinium.sample.tdd.entity.Product;
import com.testinium.sample.tdd.service.ProductService;
import com.testinium.sample.tdd.test.config.TestApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = TestApplication.class)
@ActiveProfiles("test")
public class ProductIntegrationTest {

    @Autowired(required = true)
    ProductService productService;

    @PersistenceContext
    EntityManager entityManager;

    @Test
    public void saveProductTest(){
        Product product = new Product();
        product.setName("Iphone");
        productService.save(product);
        Assert.assertTrue(product.getId() > 0);
        productService.getById(1L);
        productService.getById(1L);
        productService.getById(1L);


    }

    @Test
    public void findProductById(){

        Product product = productService.getById(1L);
        Assert.assertTrue(product.getId() > 0);

    }


}
