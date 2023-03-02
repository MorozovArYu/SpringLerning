package com.gmail.morozowau.ioc_and_di.configuration_with_annotation.Component;

import com.gmail.morozowau.ioc_and_di.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Pet pet = context.getBean("cat", Pet.class);
        pet.say();
        context.close();
    }
}
