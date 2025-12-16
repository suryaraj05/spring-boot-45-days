package com.surya.spring.day03.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FieldInjectionExample {

    @Autowired
    private Dependency dependency;

    @Override
    public String toString() {
        return "FieldInjectionExample using " + dependency;
    }

    @Component
    static class Dependency {
        @Override
        public String toString() {
            return "FieldDependency";
        }
    }
}
