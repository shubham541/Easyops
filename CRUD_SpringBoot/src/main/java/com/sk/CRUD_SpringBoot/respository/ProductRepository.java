package com.sk.CRUD_SpringBoot.respository;

import com.sk.CRUD_SpringBoot.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

    Product findProductByPid(int pid);
    public void deleteByPid(int pid);
}
