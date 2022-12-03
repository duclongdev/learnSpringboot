package com.example.integrationtestrestcontrollers.controllers;

import com.example.integrationtestrestcontrollers.entities.Student;
import com.example.integrationtestrestcontrollers.repositories.StudentRepo;
import com.example.integrationtestrestcontrollers.sevices.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class StudentController {
    @Resource
    private StudentRepo studentRepo;
    @Autowired
    private StudentService studentService;
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", defaultValue = "World") String name){
        return String.format("Hello, %s", name);
    }
    @GetMapping("hi")
    public String del(){
        Student student = studentRepo.findById(1L);
        System.out.println(student.toString());
        return "hi";
    }

    @PostMapping()
    public ResponseEntity<?> add(@RequestBody Student student){
        return studentService.addStudent(student);
    }
}
