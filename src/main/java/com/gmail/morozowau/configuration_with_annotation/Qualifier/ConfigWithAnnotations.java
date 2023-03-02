package com.gmail.morozowau.configuration_with_annotation.Qualifier;

import com.gmail.morozowau.Person;
import com.gmail.morozowau.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("PersonBean", Person.class);
        person.callYourPet();
        context.close();
    }
}
