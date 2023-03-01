package com.gmail.morozowau.dependcy_injection;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Person bean is created"); // Diagnostic
        this.pet = pet;
    }

    public Person() {
        System.out.println("Person bean is created"); // Diagnostic
    }

    public void callYourPet(){
        System.out.println("Hello my pet");
        pet.say();
    }

    public void setPet(Pet pet) {
        System.out.println("Class person: set pet"); // Diagnostic
        this.pet = pet;
    }
}
