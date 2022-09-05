package com.example.integrationtestrestcontrollers.repositories;

import com.example.integrationtestrestcontrollers.entities.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentRepo {
    @Select("Select * from student where test_id = #{student_id}")
    Student findById(Long student_id);
    @Insert("Insert into student(name, description) values (#{student_name}, #{description})")
    boolean addStudent(Student student);
    @Select("Select * from student")
    List<Student> getAll();
    @Delete("Delete from student where student_id = #{student_id}")
    boolean deleteById(Long student_id);
    @Select("Select * from student where student_name = #{student_name}")
    Student findByName(String student_name);
}
