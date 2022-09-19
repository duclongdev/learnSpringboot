package com.learn.drives;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/driver")
public class DriversController {
    @GetMapping("taxi")
    public String getTaxi(){
        System.out.println("hi");
        return "You found a taxi. The taxi is comming";
    }
}
