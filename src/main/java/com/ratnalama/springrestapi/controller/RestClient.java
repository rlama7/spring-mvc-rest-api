package com.ratnalama.springrestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * RestClient.java       --A program to represent a rest client that consumes the RESTful API.
 * @author                 Ratna Lama
 * @version                1.0
 * @since                  11/02/2020
 */

@RestController
public class RestClient {
    private static final String GET_ALL_USERS_API = "https://reqres.in/api/users?page=1";
//    private static final String GET_A_PRODUCT_BY_ID = "http://localhost:7000/productById/{id}";

    private RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/users")
    public List<Object> getAllUsers() {
        Object[] users = restTemplate.getForObject(GET_ALL_USERS_API, Object[].class);
        return Arrays.asList(users);
    }
}
