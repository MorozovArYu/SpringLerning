package com.gmail.morozowau.ioc_and_di.bean_scope;

import com.gmail.morozowau.ioc_and_di.Pet;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScope {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
//        first example
/*        Pet myDog1 = context.getBean("myPet", Pet.class);
        Pet myDog2 = context.getBean("myPet", Pet.class);

        System.out.println("Variables are the same ? " + (myDog1 == myDog2));*/
//        second example
        Pet myDog1 = context.getBean("myPet", Pet.class);
        Pet myDog2 = context.getBean("myPet", Pet.class);

        System.out.println("Variables are the same ? " + (myDog1 == myDog2));
        context.close();
    }
}
