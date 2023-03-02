package com.gmail.morozowau.ioc_and_di.configuration_with_annotation.Autowired;

import com.gmail.morozowau.ioc_and_di.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

//        Pet pet = context.getBean("cat", Pet.class);
//        pet.say();
        Person person = context.getBean("PersonBean", Person.class);
        person.callYourPet();
        context.close();
    }
}
