package com.tutorial.validation.dto;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class UserRequest {

    @NotNull
    private  String name;
    @Email(message = "Invalid email address")
    private String email;
    @NotNull
    @Pattern(regexp = "^\\d{10}$", message = "Invalid mobile number enterd")
    private String mobile;
    private String gender;
    @Min(18)
    @Max(60)
    private int age;
    @NotBlank
    private String nationality;
}
