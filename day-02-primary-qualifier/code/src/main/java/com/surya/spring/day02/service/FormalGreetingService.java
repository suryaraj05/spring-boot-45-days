package com.surya.spring.day02.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("formal")
public class FormalGreetingService implements GreetingService {

    @Override
    public String greet() {
        return "Good evening, welcome.";
    }
}
