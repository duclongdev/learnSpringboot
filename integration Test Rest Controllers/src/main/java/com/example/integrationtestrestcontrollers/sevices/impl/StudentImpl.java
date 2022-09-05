package com.example.integrationtestrestcontrollers.sevices.impl;

import com.example.integrationtestrestcontrollers.common.ResponseObject;
import com.example.integrationtestrestcontrollers.common.exception.customerExceptions.ExistsNameException;
import com.example.integrationtestrestcontrollers.entities.Student;
import com.example.integrationtestrestcontrollers.repositories.StudentRepo;
import com.example.integrationtestrestcontrollers.sevices.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@AllArgsConstructor
public class StudentImpl implements StudentService {
    private final StudentRepo studentRepo;
    @Override
    public ResponseEntity<?> addStudent(Student student) {
        Student checkExistsByName = studentRepo.findByName(student.getStudent_name()) ;
        if(checkExistsByName != null)
            throw new ExistsNameException("Name has been taken");

        boolean result = studentRepo.addStudent(student);
        if(result)
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new ResponseObject(HttpStatus.OK, "Insert data sucessfully", student));
        else return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new ResponseObject(HttpStatus.BAD_REQUEST, "failed! Try again", ""));
    }

    @Override
    public ResponseEntity<?> getAllStudent() {
        List<Student> studentList = studentRepo.getAll();
        if(studentList.size() > 0)
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new ResponseObject(HttpStatus.OK, "show all student successfully", studentList));
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new ResponseObject(HttpStatus.BAD_REQUEST, "failed! Try again", ""));
    }

    @Override
    public ResponseEntity<?> deleteById(Long student_id) {
        boolean result = studentRepo.deleteById(student_id);
        if(result)
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new ResponseObject(HttpStatus.OK, "delete data successfully", ""));
        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(new ResponseObject(HttpStatus.BAD_REQUEST, "failed! Try again", ""));
    }
}
