package com.sk.CRUD_SpringBoot.service;

import com.sk.CRUD_SpringBoot.Entity.Product;
import com.sk.CRUD_SpringBoot.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }
    public Product findProductByPid(int pid){
        return productRepository.findProductByPid(pid);
    }
    public void deleteProduct(int pid){
        productRepository.deleteByPid(pid);
    }
}
