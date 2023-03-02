package com.gmail.morozowau.configuration_with_javacode;

import com.gmail.morozowau.Cat;
import com.gmail.morozowau.Person;
import com.gmail.morozowau.Pet;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Pet cat1 = context.getBean("catBean", Pet.class);
        Pet cat2 = context.getBean("catBean", Pet.class);
        cat1.say();

/*        Person person = context.getBean("PersonBean", Person.class);
        person.callYourPet();*/
    }
}
