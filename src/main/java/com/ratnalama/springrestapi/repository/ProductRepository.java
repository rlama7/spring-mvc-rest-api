package com.ratnalama.springrestapi.repository;

import com.ratnalama.springrestapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * ProductRepository.java       --A program to represent a repository class for product entity.
 * @author                        Ratna Lama
 * @version                       1.0
 * @since                         11/01/2020
 */

@Repository
public interface ProductRepository extends JpaRepository <Product, Integer> {
    Product findByName(String name);
}
