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
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService service;

    /**
     * GET
     */

    // get all products
    // defaults to path variable --> api/products
    @GetMapping
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    // get product by id
    @GetMapping("/{id}")
    public Product findProductById(@PathVariable (value = "id") int id) {
        return service.getProductById(id);
    }

    // get product by name
    /**
    @GetMapping("/{name}")
    public Product findProductByName(@RequestParam (value = "name") String name) {
        return service.getProductByName(name);
    }
     */

    /**
     * POST
     */

    // create a single product
    // default path ---> api/products
    /**
    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }
     */

    // create a list of products
    // defaults path variable to ("api/products")
    @PostMapping
    public List<Product> createProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    /**
     * PUT aka UPDATE
     */

    // update product
    // default path variable ("api/products") + id -----> api/products/id
    @PutMapping("/{id}")
    public Product updateProduct(@RequestBody Product product, @PathVariable ("id") int id) {
        return service.saveProduct(product);
    }

    /**
     * DELETE
     */

    // delete product by id
    // default path variable ("api/products") + id ---> api/products/id
    @DeleteMapping("/{id}")
    public String deleteProduct(@PathVariable ("id") int id) {
        return service.deleteProduct(id);
    }

}
