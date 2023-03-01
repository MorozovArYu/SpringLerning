package com.gmail.morozowau;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog bean is created"); // Diagnostic
    }

    @Override
    public void say(){
        System.out.println("Bow-wow");
    }
}
