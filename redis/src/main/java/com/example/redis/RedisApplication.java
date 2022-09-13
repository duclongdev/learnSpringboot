package com.example.redis;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
public class RedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(RedisTemplate<Object, Object> redisTemplate){
        return  args ->{
            redisTemplate.opsForValue().set("likelion", "Hello");
            System.out.println("Value of key likelion : " + redisTemplate.opsForValue().get("likelion"));
        };
    }
}
