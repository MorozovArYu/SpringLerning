package com.gmail.morozowau.configuration_with_javacode;

import com.gmail.morozowau.Cat;
import com.gmail.morozowau.Person;
import com.gmail.morozowau.Pet;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config2 {

    @Bean
    @Scope("prototype") // specifying scope
    public Pet catBean() { // id: catBean
        System.out.println("catBean creating");
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean()); // Dependency Injection
    }


}
