package com.gmail.morozowau.ioc_and_di.configuration_with_javacode;

import com.gmail.morozowau.ioc_and_di.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        /*Pet cat1 = context.getBean("catBean", Pet.class);
        Pet cat2 = context.getBean("catBean", Pet.class);
        cat1.say();*/



        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getSurName());
        System.out.println(person.getAge());
    }
}
