package com.gmail.morozowau.aop.lesson13;

import com.gmail.morozowau.aop.Config;
import com.gmail.morozowau.aop.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AspectsOrderOfExecutionTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);

        uniLibrary.getMagazine();
        uniLibrary.returnMagazine();
        uniLibrary.addMagazine();

        uniLibrary.getBook();
        uniLibrary.returnBook();
        uniLibrary.addBook();


        context.close();
    }
}
