package com.gmail.morozowau;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat implements Pet {
    public Cat() {
        System.out.println("Cat bean is created"); // Diagnostic
    }

    @Override
    public void say(){
        System.out.println("Meow-meow");
    }
}
