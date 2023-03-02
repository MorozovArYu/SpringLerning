package com.gmail.morozowau.ioc_and_di;


public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created"); // Diagnostic
    }

    @Override
    public void say(){
        System.out.println("Meow-meow");
    }
}
