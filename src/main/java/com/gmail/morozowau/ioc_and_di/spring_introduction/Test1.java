package com.gmail.morozowau.ioc_and_di.spring_introduction;

import com.gmail.morozowau.ioc_and_di.Cat;
import com.gmail.morozowau.ioc_and_di.Pet;

public class Test1 {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.say();
    }
}
