package com.gmail.morozowau.configuration_with_annotation.Value;

import com.gmail.morozowau.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = context.getBean("PersonBean", Person.class);
        person.callYourPet();

        System.out.println("--------------");
        System.out.println(person.getSurName());
        System.out.println(person.getAge());
        context.close();
    }
}
