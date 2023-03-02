package com.gmail.morozowau.ioc_and_di.dependcy_injection;

import com.gmail.morozowau.ioc_and_di.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = context.getBean("myPet", Pet.class);
//        Pet pet = new Cat();
//        Person person = new Person(pet);
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        System.out.println("--------------");
        System.out.println(person.getSurName());
        System.out.println(person.getAge());
        context.close();
    }
}
