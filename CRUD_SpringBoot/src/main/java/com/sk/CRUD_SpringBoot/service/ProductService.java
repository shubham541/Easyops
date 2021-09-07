package com.sk.CRUD_SpringBoot.service;

import com.sk.CRUD_SpringBoot.Entity.Product;
import com.sk.CRUD_SpringBoot.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    public Product findProductByPid(int pid);
    public Product saveProduct(Product product);
    public void deleteProduct(int productId);
}
