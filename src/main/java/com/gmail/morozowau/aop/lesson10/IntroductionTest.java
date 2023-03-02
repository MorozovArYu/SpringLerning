package com.gmail.morozowau.aop.lesson10;

import com.gmail.morozowau.aop.Book;
import com.gmail.morozowau.aop.Config;
import com.gmail.morozowau.aop.SchoolLibrary;
import com.gmail.morozowau.aop.UniLibrary;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IntroductionTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);


        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        Book book = context.getBean("book", Book.class);

        System.out.println(book.getName());

        library.getBook(book);
        library.getMagazine(2,15);



        context.close();

    }
}
