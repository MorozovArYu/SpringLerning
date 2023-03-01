package com.gmail.morozowau.dependcy_injection;

import com.gmail.morozowau.dependcy_injection.Pet;

public class Dog implements Pet {

    @Override
    public void say(){
        System.out.println("Bow-wow");
    }
}
