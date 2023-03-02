package com.gmail.morozowau.aop.lesson10;

import com.gmail.morozowau.aop.Config;
import com.gmail.morozowau.aop.Library;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IntroductionTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Library library = context.getBean("libraryBean", Library.class);
        library.getBook();

        context.close();

    }
}
