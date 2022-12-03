package com.example.interceptor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class InterceptorController {

    @GetMapping("")
    public String testapi(){
        System.out.println("....Inside the controller....");
        return "please check the console";
    }
    @GetMapping("all")
    public String testall(){
        System.out.println("....Inside the controller....");
        return "please check the console";
    }
}
