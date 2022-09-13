package com.tutorial.validation.controller;


import com.tutorial.validation.common.ErrorResponse;
import com.tutorial.validation.common.exception.Response;
import com.tutorial.validation.dto.UserRequest;
import com.tutorial.validation.model.User;
import com.tutorial.validation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AppController {
    @Qualifier("imp")
    @Autowired
    UserService userService;
    @GetMapping
    public List<User> getAll()  {
        return userService.getAll();
    }
    @GetMapping("/count")
    public int countUser(){
        return userService.count();
    }
    @PostMapping()
    public ResponseEntity<Response> addUser(@RequestBody @Valid UserRequest user){
        return ResponseEntity.status(HttpStatus.OK).body(new Response(HttpStatus.OK, userService.addUser(user)));
    }

}
