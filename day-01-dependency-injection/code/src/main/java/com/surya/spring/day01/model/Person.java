package com.surya.spring.day01.model;

public class Person {

    private final String name;
    private final int age;
    private final Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", age=" + age + ", address=" + address + "]";
    }
}
