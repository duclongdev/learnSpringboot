package com.example.integrationtestrestcontrollers.repositories;

import com.example.integrationtestrestcontrollers.entities.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class StudentRepoStudent {
    @Resource
    private StudentRepo studentRepo;
    @Test
    void findById(){
        Student student = new Student(1L, "long", "hi");
        Student test = studentRepo.findById(1L);
        System.out.println(test);
        assertEquals(student, test);
    }
}