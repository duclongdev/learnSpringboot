package com.example.ioc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class IoCApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(IoCApplication.class, args);

        Car hondaCar = context.getBean(Car.class);
        hondaCar.run();
    }
}
