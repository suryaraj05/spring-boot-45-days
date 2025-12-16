package com.surya.spring.day05;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class LifecycleBean {

    public LifecycleBean() {
        System.out.println("Constructor executed");
    }

    @PostConstruct
    public void initialize() {
        System.out.println("@PostConstruct executed");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("@PreDestroy executed");
    }
}
