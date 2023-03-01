package com.gmail.morozowau.dependcy_injection;

import com.gmail.morozowau.dependcy_injection.Pet;

public class Dog implements Pet {
    public Dog() {
        System.out.println("Dog bean is created"); // Diagnostic
    }

    @Override
    public void say(){
        System.out.println("Bow-wow");
    }
}
