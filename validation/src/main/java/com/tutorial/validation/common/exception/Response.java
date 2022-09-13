package com.tutorial.validation.common.exception;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
@Data
@AllArgsConstructor
public class Response {
    private HttpStatus httpStatus;
    private Object data;
}
