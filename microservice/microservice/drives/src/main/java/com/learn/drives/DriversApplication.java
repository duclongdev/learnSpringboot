package com.learn.drives;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DriversApplication {
    public static void main(String[] args){
        SpringApplication.run(DriversApplication.class, args);
    }
}
