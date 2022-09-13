package com.tutorial.validation.common.exception.custome;

public class NameExistsException extends  RuntimeException{
    public NameExistsException(String entityName){
        super(String.format("Name has been taken, can't create %s", entityName));
    }
}
