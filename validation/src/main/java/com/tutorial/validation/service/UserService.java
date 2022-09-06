package com.tutorial.validation.service;

import com.tutorial.validation.dto.UserRequest;
import com.tutorial.validation.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User addUser(UserRequest user);
    int count();

}
