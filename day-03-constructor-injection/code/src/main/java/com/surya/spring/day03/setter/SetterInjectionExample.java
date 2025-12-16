package com.surya.spring.day03.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SetterInjectionExample {

    private Dependency dependency;

    @Autowired
    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }

    @Override
    public String toString() {
        return "SetterInjectionExample using " + dependency;
    }

    @Component
    static class Dependency {
        @Override
        public String toString() {
            return "SetterDependency";
        }
    }
}
