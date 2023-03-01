package com.gmail.morozowau.dependcy_injection;

import com.gmail.morozowau.dependcy_injection.Cat;
import com.gmail.morozowau.dependcy_injection.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet pet = context.getBean("myPet", Pet.class);
//        Pet pet = new Cat();
        Person person = new Person(pet);
        person.callYourPet();
    }
}
