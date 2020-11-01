package com.ratnalama.springrestapi.repository;

import com.ratnalama.springrestapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Integer> {
}
