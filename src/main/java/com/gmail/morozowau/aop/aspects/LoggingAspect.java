package com.gmail.morozowau.aop.aspects;


import com.gmail.morozowau.aop.Book;
import com.gmail.morozowau.aop.lesson14.JoinPointTest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import com.gmail.morozowau.aop.aspects.Pointcuts.*;

import java.util.Arrays;


@Component
@Aspect
@Order(10)
public class LoggingAspect {
    // Pointcut declaration


   /* @Before("com.gmail.morozowau.aop.aspects.Pointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><>");
        System.out.println("beforeGetLoggingAdvice: Logging ...\n");
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        if (signature.getName().equals("addBook")){
            Object[] args = joinPoint.getArgs();
            for (Object arg : args) {
                if (arg instanceof Book) {
                    Book myBook = ((Book) arg);
                    System.out.println("Информация о книге:");
                    System.out.println(myBook.getName());
                    System.out.println(myBook.getAuthor());
                    System.out.println(myBook.getYearOfPublication());
                } else if (arg instanceof String) {
                    System.out.println("Книгу в библиотеку добавил: " + arg);
                }
            }
        }
        System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><>\n");

    }*/


}
