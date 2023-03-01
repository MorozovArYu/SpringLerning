package com.gmail.morozowau.dependcy_injection;

import com.gmail.morozowau.dependcy_injection.Pet;

public class Cat implements Pet {

    @Override
    public void say(){
        System.out.println("Meow-meow");
    }
}
