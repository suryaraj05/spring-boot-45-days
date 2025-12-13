package com.surya.spring.day01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.surya.spring.day01.model.Address;
import com.surya.spring.day01.model.Person;

@Configuration
public class AppConfig {

    @Bean
    public String name() {
        return "Surya";
    }

    @Bean
    public int age() {
        return 20;
    }

    @Bean
    public Address address() {
        return new Address("Bhagyanagar Colony", "Ichoda");
    }

    @Bean
    public Person person(String name, int age, Address address) {
        return new Person(name, age, address);
    }
}
