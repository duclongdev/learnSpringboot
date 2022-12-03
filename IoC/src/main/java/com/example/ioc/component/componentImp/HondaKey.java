package com.example.ioc.component.componentImp;

import com.example.ioc.component.Key;
import org.springframework.stereotype.Component;

@Component
public class HondaKey implements Key {
    @Override
    public String unlock() {
        return "Mở khóa xe Honda";
    }
}
