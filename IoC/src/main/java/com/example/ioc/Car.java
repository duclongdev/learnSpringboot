package com.example.ioc;

import com.example.ioc.component.Engine;
import com.example.ioc.component.Key;
import com.example.ioc.component.Wheel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    @Autowired
    private Engine engine;
    @Autowired
    private Key key;
    @Autowired
    private Wheel wheel;
    public void run(){
        System.out.println(String.format("1. Mở khóa: %s, 2.Khởi động: %s ,3. Bánh xe: %s ",
                key.unlock(), engine.run(), wheel.run()));
    }
}
