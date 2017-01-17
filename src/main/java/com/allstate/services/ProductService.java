package com.allstate.services;

import com.allstate.entities.Product;
import com.allstate.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private IProductRepository repository;

    @Autowired
    public void setRepository(IProductRepository repository) {
        this.repository = repository;
    }

    public Product create(Product p){
        return  this.repository.save(p);
    }
}
