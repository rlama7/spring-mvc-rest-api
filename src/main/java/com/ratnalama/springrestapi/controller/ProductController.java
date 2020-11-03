package com.ratnalama.springrestapi.controller;

import com.ratnalama.springrestapi.entity.Product;
import com.ratnalama.springrestapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ProductController.java       --A program to represent a controller class.
 * @author                        Ratna Lama
 * @version                       1.0
 * @since                         11/01/2020
 */

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    /**
     * GET
     */

    // get all products
    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    // get product by id
    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    // get product by name
    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    /**
     * POST
     */

    // create a single product
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    // create a list of products
    @PostMapping("/addProducts")
    public List<Product> products (@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    /**
     * PUT aka UPDATE
     */

    // update product
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    /**
     * DELETE
     */

    // delete product by id
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }

}
