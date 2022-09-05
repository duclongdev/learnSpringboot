package com.example.integrationtestrestcontrollers.sevices;

import com.example.integrationtestrestcontrollers.entities.Student;
import org.springframework.http.ResponseEntity;

public interface StudentService {
    ResponseEntity<?> addStudent(Student student);
    ResponseEntity<?> getAllStudent();
    ResponseEntity<?> deleteById(Long student_id);
}
