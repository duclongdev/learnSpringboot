package com.example.integrationtestrestcontrollers.sevices.impl;

import com.example.integrationtestrestcontrollers.common.exception.customerExceptions.ExistsNameException;
import com.example.integrationtestrestcontrollers.entities.Student;
import com.example.integrationtestrestcontrollers.repositories.StudentRepo;
import com.example.integrationtestrestcontrollers.sevices.StudentService;
import org.apache.ibatis.annotations.Mapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.junit4.SpringRunner;

//import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
@RunWith(SpringRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class StudentImplTest {
    @Mock
    private StudentRepo studentRepo;
    private StudentService studentService;
    @BeforeEach
    void setUp() {
        studentService = new StudentImpl(studentRepo);
    }
    @Test
    void addStudent() {
        Student student = new Student(1L, "long", "super awesome");
        given(studentRepo.findByName(student.getStudent_name())).willReturn(student);
        assertThatThrownBy(()-> studentService.addStudent(student))
                .isInstanceOf(ExistsNameException.class)
                .hasMessageContaining("Name has been taken");

//        studentService.addStudent(student);
//        ArgumentCaptor<Student> studentArgumentCaptor =
//                ArgumentCaptor.forClass(Student.class);
//        verify(studentRepo).addStudent(studentArgumentCaptor.capture());
//        Student captureStudent = studentArgumentCaptor.getValue();
//        assertThat(captureStudent).isEqualTo(student);

    }

    @Test
    void getAllStudent() {
        studentService.getAllStudent();
        verify(studentRepo).getAll();
    }

    @Test
    @Disabled
    void deleteById() {
    }
}