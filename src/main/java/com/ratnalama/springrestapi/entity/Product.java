package com.ratnalama.springrestapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Product.java       --A program to represent a product entity class.
 * @author              Ratna Lama
 * @version             1.0
 * @since               11/01/2020
 */

@Entity
@Table(name= "PRODUCT_TBL")
public class Product {

    // ID is the primary key thus will be annotated as @Id and also will be auto-generated
    @Id
    @GeneratedValue
    private int id;

    private String name;
    private int quantity;
    private double price;

    public Product() {
    }

    public Product(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
