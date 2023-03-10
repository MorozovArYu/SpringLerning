package com.gmail.morozowau.ioc_and_di;

import org.springframework.beans.factory.annotation.Value;


public class Person {

    private Pet pet;

    @Value("${person.surname}") // example 2
    private String surName;
    @Value("${person.age}") // example 1
    private int age;


    public Person(Pet pet) {
        System.out.println("Person bean is created"); // Diagnostic
        this.pet = pet;
    }

    public Person() {
        System.out.println("Person bean is created"); // Diagnostic
    }

    public void callYourPet() {
        System.out.println("Hello my pet");
        pet.say();
    }


    public void setPet(Pet pet) {
        System.out.println("Class person: set pet"); // Diagnostic
        this.pet = pet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class person: set age"); // Diagnostic
        this.age = age;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        System.out.println("Class person: set surName"); // Diagnostic
        this.surName = surName;
    }


}
