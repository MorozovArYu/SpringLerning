package com.gmail.morozowau.aop;


import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook(Book book) {
        System.out.println("getting " +  book.getName() + " from university library \n");
    }

    public void getMagazine(int a, int b) {
        System.out.println("getting magazine from university library \n");
    }

    public String returnBook(){
        System.out.println("returning book to university library \n");
        return "book";
    }

}
