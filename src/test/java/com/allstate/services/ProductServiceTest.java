package com.allstate.services;

import com.allstate.entities.Product;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(value = {"/sql/seed.sql"})
public class ProductServiceTest {

    @Autowired
    ProductService service;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateProduct() throws Exception{
        Product before = new Product();
        before.setName("JBL");
        Product after = this.service.create(before);
        assertEquals(1, after.getId());
    }

    @Test
    public void shouldFetchOneProduct() throws Exception{
        Product before = new Product();
        before.setName("JBL");
        before.setDescription("best in quality");
        Product after = this.service.findOneById(1);
        //assertNotNull(after);
        assertEquals("JBL",after.getName());
    }

    @Test
    public void shouldFindAllProducts() throws Exception {
        Product before = new Product();
        before.setName("headphone");
        Product after = this.service.create(before);
        Product second = new Product();
        second.setName("mi");
        Product result = this.service.create(second);

        Iterable<Product> products = this.service.findAll();
        List<Product> list = (List) products;
        assertEquals(2,list.size());
    }
}