package com.surya.spring.day02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.surya.spring.day02.controller.GreetingController;

public class MainApplication {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class)) {

            context.getBean(GreetingController.class).greet();
        }
    }
}
