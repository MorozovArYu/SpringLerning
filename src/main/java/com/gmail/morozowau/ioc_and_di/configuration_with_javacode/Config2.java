package com.gmail.morozowau.ioc_and_di.configuration_with_javacode;

import com.gmail.morozowau.ioc_and_di.Cat;
import com.gmail.morozowau.ioc_and_di.Person;
import com.gmail.morozowau.ioc_and_di.Pet;
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
