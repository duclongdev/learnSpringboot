package com.example.currencyexcange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CurrencyExchangeApp {
    public static void main(String[] args) {
        SpringApplication.run(CurrencyExchangeApp.class, args);
    }
}
