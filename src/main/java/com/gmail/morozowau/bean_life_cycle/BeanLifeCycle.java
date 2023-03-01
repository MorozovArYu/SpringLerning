package com.gmail.morozowau.bean_life_cycle;

import com.gmail.morozowau.Dog;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        myDog.say();

        context.close();
    }
}
