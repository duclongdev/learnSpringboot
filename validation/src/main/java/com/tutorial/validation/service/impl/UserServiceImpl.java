package com.tutorial.validation.service.impl;


import com.tutorial.validation.common.Constant;
import com.tutorial.validation.common.exception.custome.NameExistsException;
import com.tutorial.validation.common.exception.custome.NotFoundException;
import com.tutorial.validation.dto.UserRequest;
import com.tutorial.validation.model.User;
import com.tutorial.validation.repository.UserRepo;
import com.tutorial.validation.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("imp")
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;


    @Override
    public List<User> getAll() {
        if (userRepo.findAll().size() > 0)
            return userRepo.findAll();
        throw new NotFoundException("user can't be found");
    }

    @Override
    public User addUser(UserRequest userRequest) {
        User user = new User(null, userRequest.getName(), userRequest.getEmail(), userRequest.getMobile(),
                userRequest.getGender(), userRequest.getAge(), userRequest.getNationality());
        if (userRepo.findByName(user.getName()) == null) {
            userRepo.save(user);
            return user;
        }

        throw new NameExistsException(Constant.EntityName.USER);
    }

    @Override
    public int count() {
        return 0;
    }
}
