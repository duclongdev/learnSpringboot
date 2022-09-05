package com.example.integrationtestrestcontrollers.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Student {
    private Long student_id;
    private String student_name;
    private String description;
}
