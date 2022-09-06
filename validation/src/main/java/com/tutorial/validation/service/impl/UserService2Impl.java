package com.tutorial.validation.service.impl;

import com.tutorial.validation.common.exception.custome.NotFoundException;
import com.tutorial.validation.dto.UserRequest;
import com.tutorial.validation.model.User;
import com.tutorial.validation.repository.UserRepository;
import com.tutorial.validation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("imp2")
public class UserService2Impl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAll() {
       if( userRepository.count() > 0){
           return userRepository.getAll();
       }
       throw new NotFoundException("Not found");
    }
    @Override
    public User addUser(UserRequest user) {
        return null;
    }

    @Override
    public int count() {
        return userRepository.count();
    }
}
