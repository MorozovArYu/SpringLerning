package com.gmail.morozowau.aop;


import org.springframework.stereotype.Component;

import java.util.TreeMap;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {
        System.out.println("---------------------------");
        System.out.println("getting from university library");
        System.out.println("---------------------------\n");
    }

    public void getMagazine() {
        System.out.println("---------------------------");
        System.out.println("getting magazine from university library");
        System.out.println("---------------------------\n");
    }

    public String returnBook() {
        int a = 10 / 0;
        System.out.println("returning book to university library");
        return "War and Peace";
    }

    public void returnMagazine() {
        System.out.println("---------------------------");
        System.out.println("returning magazine to university library");
        System.out.println("---------------------------\n");

    }

    public void addBook(String personName, Book book) {
        System.out.println("---------------------------");
        System.out.println("adding book to university library");
        System.out.println("---------------------------\n");
    }

    public void addMagazine() {
        System.out.println("---------------------------");
        System.out.println("adding magazine to university library");
        System.out.println("---------------------------\n");
    }


}
