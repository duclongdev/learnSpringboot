package com.learn.customers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RefreshScope
public class MessageRestController {
    @Value("${text.service.name}")
    private String message;
    @GetMapping("/message")
    String getMessage(){
        return this.message;
    }
}
