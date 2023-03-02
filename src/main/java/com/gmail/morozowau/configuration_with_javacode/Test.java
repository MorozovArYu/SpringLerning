package com.gmail.morozowau.configuration_with_javacode;

import com.gmail.morozowau.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Person person = context.getBean("PersonBean", Person.class);
        person.callYourPet();
    }
}
