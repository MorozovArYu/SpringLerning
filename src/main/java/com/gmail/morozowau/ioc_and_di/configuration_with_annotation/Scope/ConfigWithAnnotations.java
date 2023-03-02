package com.gmail.morozowau.ioc_and_di.configuration_with_annotation.Scope;

import com.gmail.morozowau.ioc_and_di.Dog;
import com.gmail.morozowau.ioc_and_di.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("PersonBean", Person.class);
//        person.callYourPet();
        Dog myDog = context.getBean("dog", Dog.class);
        Dog yourDog = context.getBean("dog", Dog.class);

        System.out.println("Variables are the same ? " + (myDog == yourDog));

        context.close();
    }
}
