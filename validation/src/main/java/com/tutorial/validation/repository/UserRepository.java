package com.tutorial.validation.repository;

import com.tutorial.validation.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;


@Mapper
public interface UserRepository {
    @Select("select count(1) from users")
    int count();

    @Select("select * from users")
    @Results(value = {@Result(property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "email", column = "email")})
    List<User> getAll();


}
