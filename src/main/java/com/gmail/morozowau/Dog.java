package com.gmail.morozowau;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog bean is created"); // Diagnostic
    }

    @Override
    public void say(){
        System.out.println("Bow-wow");
    }

    public void init(){
        System.out.println("Class Dog: init method");
    }

    public void destroy(){
        System.out.println("Class Dog: destroy method");
    }
}
