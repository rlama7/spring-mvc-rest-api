package com.ratnalama.springrestapi.service;

import com.ratnalama.springrestapi.entity.Product;
import com.ratnalama.springrestapi.exception.ResourceNotFoundException;
import com.ratnalama.springrestapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ProductService.java       --A program to represent a product service class.
 * @author                     Ratna Lama
 * @version                    1.0
 * @since                      11/01/2020
 */

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    /**
     * GET
     */

    // get all product
    public List<Product> getProducts() {
        return repository.findAll();
    }

    // get product by Id
    public Product getProductById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id --> " + id));
    }

    // get product by Name
    public Product getProductByName(String name) {
        return repository.findByName(name);
    }


    /**
     * POST
     */

    // create a product
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    // create lists of products
    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    /**
     * PUT
     */

    // update a product
    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getId())
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id --> " + product.getId()));
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }

    /**
     * DELETE
     */

    // delete a product by id
    public String deleteProduct(int id) {
        Product existingProduct = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found with id --> " + id));
        repository.delete(existingProduct);
        return "Product successfully removed with id --> " + id;
    }
}
