package com.surya.spring.day02.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CasualGreetingService implements GreetingService {

    @Override
    public String greet() {
        return "Hi! How are you?";
    }
}
