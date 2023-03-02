package com.gmail.morozowau.aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary{

    public void getBook() {
        System.out.println("getting book from school library \n");
    }
}
