package com.surya.spring.day03.constructor;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionExample {

    private final Dependency dependency;

    public ConstructorInjectionExample(Dependency dependency) {
        this.dependency = dependency;
    }

    @Override
    public String toString() {
        return "ConstructorInjectionExample using " + dependency;
    }

    @Component
    static class Dependency {
        @Override
        public String toString() {
            return "ConstructorDependency";
        }
    }
}
