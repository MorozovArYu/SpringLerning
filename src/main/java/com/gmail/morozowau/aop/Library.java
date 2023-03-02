package com.gmail.morozowau.aop;


import org.springframework.stereotype.Component;

@Component("libraryBean")
public class Library {
    public void getBook(){
        System.out.println("We are getting book");
    }

}
