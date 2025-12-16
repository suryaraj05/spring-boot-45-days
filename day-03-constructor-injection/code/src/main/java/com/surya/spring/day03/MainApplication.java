package com.surya.spring.day03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.surya.spring.day03.constructor.ConstructorInjectionExample;
import com.surya.spring.day03.field.FieldInjectionExample;
import com.surya.spring.day03.setter.SetterInjectionExample;

public class MainApplication {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class)) {

            System.out.println(context.getBean(FieldInjectionExample.class));
            System.out.println(context.getBean(SetterInjectionExample.class));
            System.out.println(context.getBean(ConstructorInjectionExample.class));
        }
    }
}
