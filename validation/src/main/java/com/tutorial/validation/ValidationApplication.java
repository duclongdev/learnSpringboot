package com.tutorial.validation;

import com.tutorial.validation.model.User;
import com.tutorial.validation.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ValidationApplication implements CommandLineRunner {
    @Qualifier("imp")
    @Autowired
    public UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(ValidationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        User user = new User("Nguyen duc long", "sv2htth@gmail.com");
//        userService.addUser(user);
    }

    @Bean
    ModelMapper getModelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper;

    }

}
