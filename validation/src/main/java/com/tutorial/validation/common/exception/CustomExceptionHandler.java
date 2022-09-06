package com.tutorial.validation.common.exception;

import com.tutorial.validation.common.exception.custome.NameExistsException;
import com.tutorial.validation.common.exception.custome.NotFoundException;
import com.tutorial.validation.common.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse handlerNotFoundException(NotFoundException ex, WebRequest req) {
        return new ErrorResponse(HttpStatus.NOT_FOUND, ex.getMessage());
    }
    @ExceptionHandler(NameExistsException.class)
    public ResponseEntity<?> handlerNameExistsException(NameExistsException ex, WebRequest req){
        return new ResponseEntity<>(new ErrorResponse(HttpStatus.NOT_IMPLEMENTED, ex.getMessage()),
                HttpStatus.NOT_IMPLEMENTED);
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Map<String, String> handlerMethodArgumentNotValidException(MethodArgumentNotValidException ex){
       Map<String, String> errorMap = new HashMap<>();
       ex.getBindingResult().getFieldErrors().forEach(error -> {
           errorMap.put(error.getField(), error.getDefaultMessage());
       });
       return errorMap;
    }
}
