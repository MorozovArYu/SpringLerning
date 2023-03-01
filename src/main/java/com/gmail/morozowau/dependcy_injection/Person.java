package com.gmail.morozowau.dependcy_injection;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Person bean is created"); // Diagnostic
        this.pet = pet;
    }

    public void callYourPet(){
        System.out.println("Hello my pet");
        pet.say();
    }
}
