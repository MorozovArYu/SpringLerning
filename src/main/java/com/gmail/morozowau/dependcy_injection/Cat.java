package com.gmail.morozowau.dependcy_injection;

import com.gmail.morozowau.dependcy_injection.Pet;

public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created"); // Diagnostic
    }

    @Override
    public void say(){
        System.out.println("Meow-meow");
    }
}
