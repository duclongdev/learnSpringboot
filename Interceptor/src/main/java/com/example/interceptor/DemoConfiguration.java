package com.example.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class DemoConfiguration implements WebMvcConfigurer {
    @Autowired
    DemoInterceptor demoInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
  //     registry.addInterceptor(demoInterceptor);
        registry.addInterceptor(demoInterceptor).addPathPatterns("/api/*");
    }

}
