package com.surya.spring.day02.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.surya.spring.day02.service.GreetingService;

@Component
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(
            @Qualifier("formal") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void greet() {
        System.out.println(greetingService.greet());
    }
}
