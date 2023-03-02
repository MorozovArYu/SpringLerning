package com.gmail.morozowau.configuration_with_javacode;

import com.gmail.morozowau.Cat;
import com.gmail.morozowau.Person;
import com.gmail.morozowau.Pet;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
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
