package com.learn.customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("api/customer")
public class CustomersController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("findTaxi")
    public String findTaxi()
    {
        String result = restTemplate.getForObject("http://DRIVES/api/driver/taxi", String.class);
        return result;
    }
}
