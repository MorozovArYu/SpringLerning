package com.gmail.morozowau.aop.lesson14;

import com.gmail.morozowau.aop.Book;
import com.gmail.morozowau.aop.Config;
import com.gmail.morozowau.aop.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JoinPointTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

        Book book = context.getBean("book", Book.class);
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        uniLibrary.addBook("Artem", book);
/*        uniLibrary.getMagazine();
        uniLibrary.returnMagazine();
        uniLibrary.addMagazine();*/
    }
}
