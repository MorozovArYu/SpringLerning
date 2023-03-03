package com.gmail.morozowau.aop.lesson15;

import com.gmail.morozowau.aop.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AdviceTypesTest {
    public static void main(String[] args) {
        System.out.println("method main starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);

/*        University university = context.getBean("university", University.class);

        university.addStudents();
        List<Student> students = null;
        try {
            students = university.getStudents();
        } catch (Exception e) {
            System.out.println("Exception catches: " + e.getMessage());
        }
        System.out.println(students);*/
        UniLibrary uniLibrary = context.getBean("uniLibrary", UniLibrary.class);
        long start = System.nanoTime() / 1000;
        String s = uniLibrary.returnBook();
        long end = System.nanoTime() / 1000;
        System.out.println("Time of work returnBook " + (end - start) + " mcs");
        System.out.println(s + " returned to the library");

        context.close();
        System.out.println("method main ends");
    }

}
