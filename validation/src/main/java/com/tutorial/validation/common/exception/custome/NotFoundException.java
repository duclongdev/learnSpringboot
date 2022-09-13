package com.tutorial.validation.common.exception.custome;

public class NotFoundException extends RuntimeException{
    public NotFoundException(String message) {
        super(String.format("%s can be found", message));
    }
}
