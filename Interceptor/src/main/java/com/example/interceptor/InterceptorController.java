package com.example.interceptor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InterceptorController {

    @GetMapping()
    public String test(){
        System.out.println("....Inside the controller....");
        return "please check the console";
    }
}
