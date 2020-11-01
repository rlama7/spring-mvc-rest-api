package com.ratnalama.springrestapi.service;

import com.ratnalama.springrestapi.entity.Product;
import com.ratnalama.springrestapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    /**
     * GET
     */

    // find all
    public List<Product> getProducts() {
        return repository.findAll();
    }

    // find by Id
    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }

    // get product by Name
    public Product getProductByName(String name) {
        return repository.findByName(name);
    }


    /**
     * POST
     */

    // save all
    public Product saveProduct(Product product) {
        return repository.save(product);
    }

    // save by Id
    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    /**
     * PUT
     */
    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }

    /**
     * DELETE
     */
    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "Product successfully removed --> " + id;
    }
}
