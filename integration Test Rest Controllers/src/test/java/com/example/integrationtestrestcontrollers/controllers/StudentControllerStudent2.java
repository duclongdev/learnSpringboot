package com.example.integrationtestrestcontrollers.controllers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;


@WebMvcTest(StudentController.class)
@ExtendWith(SpringExtension.class)
class StudentControllerStudent2 {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void hello() throws Exception {
        RequestBuilder requestBuilder = get("/hello");
        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        assertEquals("Hello, Worldd", result.getResponse().getContentAsString());
    }

    @Test
    public void helloWithName() throws Exception {
        mockMvc.perform(get("/hello?name=Long"))
                .andExpect(content().string("Hello, Long"));
    }

}