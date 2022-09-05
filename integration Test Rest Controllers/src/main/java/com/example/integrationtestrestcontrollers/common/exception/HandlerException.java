package com.example.integrationtestrestcontrollers.common.exception;

import com.example.integrationtestrestcontrollers.common.ErrorResponse;
import com.example.integrationtestrestcontrollers.common.exception.customerExceptions.ExistsNameException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class HandlerException {
    @ExceptionHandler(ExistsNameException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse handlerExistsNameException(ExistsNameException ex){
        return new ErrorResponse(HttpStatus.BAD_REQUEST, ex.getMessage());
    }
}
