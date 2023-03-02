package com.gmail.morozowau.aop;


import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("getting from university library \n");
    }

    public void getMagazine() {
        System.out.println("getting magazine from university library \n");
    }

    public void returnBook() {
        System.out.println("returning book to university library \n");
    }

    public void returnMagazine(){
        System.out.println("returning magazine to university library \n");
    }

    public void addBook(){
        System.out.println("adding book to university library \n");
    }

    public void addMagazine(){
        System.out.println("adding magazine to university library \n");
    }



}
