package com.ratnalama.springrestapi.controller;

import com.ratnalama.springrestapi.entity.Product;
import com.ratnalama.springrestapi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    /**
     * GET
     */
    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    /**
     * POST
     */
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> products (@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    /**
     * PUT aka UPDATE
     */
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    /**
     * DELETE
     */

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }

}
