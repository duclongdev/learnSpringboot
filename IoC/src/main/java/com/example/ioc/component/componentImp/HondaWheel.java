package com.example.ioc.component.componentImp;

import com.example.ioc.component.Wheel;
import org.springframework.stereotype.Component;

@Component
public class HondaWheel implements Wheel {
    @Override
    public String run() {
        return "Xe honda lăn bánh";
    }
}
