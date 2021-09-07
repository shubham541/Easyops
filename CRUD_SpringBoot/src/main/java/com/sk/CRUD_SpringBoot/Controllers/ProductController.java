package com.sk.CRUD_SpringBoot.Controllers;

import com.sk.CRUD_SpringBoot.Entity.Product;
import com.sk.CRUD_SpringBoot.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/home")
    public String home(){
        System.out.println("Home Path Triggered");
        return "Welcome to Product Application";
    }
    @PostMapping("/save")
    public Product saveDepartment(@RequestBody Product product) {
        System.out.println("inside saveDept");
        System.out.println(product);
        return productService.saveProduct(product);
    }

    @GetMapping("/find/{id}")
    public Product findDepartmentById(@PathVariable("id") int productId) {
        return productService.findProductByPid(productId);
    }

   @GetMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
    @GetMapping("/delete/{pid}")
    @Transactional
    public String deleteProduct(@PathVariable("pid") int productId) {
         productService.deleteProduct(productId);
         return "Deleted";
    }

}
