package com.example.integrationtestrestcontrollers.common.exception.customerExceptions;

public class ExistsNameException extends RuntimeException{
    public ExistsNameException(String error){
        super(error);
    }
}
