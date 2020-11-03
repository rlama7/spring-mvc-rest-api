package com.ratnalama.springrestapi.entity;

import javax.persistence.*;

/**
 * Product.java       --A program to represent a product entity class. This class will map
 *                      to a product table with specified column fields.
 * @author              Ratna Lama
 * @version             1.0
 * @since               11/01/2020
 */

@Entity
@Table(name = "product")
public class Product {

    // ID is the primary key thus will be annotated as @Id and also will be auto-generated
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    // column annotation specifies the table column field

    private String name;
    private double price;
    private int quantity;


    // no args constructor needed
    public Product() {
    }

    // Id will be AUTO generated thus we exclude it from the Constructor argument lists
    public Product(String name, int quantity, double price) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
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
