package com.ratnalama.springrestapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


/**
 * ResourceNotFoundException.java     --A program to represent an exception if the resource is not found.
 * @author                              Ratna Lama
 * @version                             1.0
 * @since                               11/02/2020
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
