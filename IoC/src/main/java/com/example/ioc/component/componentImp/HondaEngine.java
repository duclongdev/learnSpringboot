package com.example.ioc.component.componentImp;

import com.example.ioc.component.Engine;
import org.springframework.stereotype.Component;

@Component
public class HondaEngine implements Engine {
    @Override
    public String run() {
       return "Động cơ honda bắt đầu đốt nhiên liệu";
    }
}
