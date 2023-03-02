package com.gmail.morozowau.aop.lesson12;

import com.gmail.morozowau.aop.Config;
import com.gmail.morozowau.aop.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PointCutDeclarationTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);

        uniLibrary.returnMagazine();
        uniLibrary.returnBook();

        uniLibrary.getBook();
        uniLibrary.getMagazine();


    }
}
