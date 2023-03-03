package com.gmail.morozowau.aop.aspects;

import com.gmail.morozowau.aop.Student;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect{


    // Example 1
    /*@Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable { // proceedingJoinPoint обязателен и необходим для работы с таргет методом
        System.out.println("aroundReturnBookLoggingAdvice: trying to return book to the library ...");

        Object targetMethodResult = proceedingJoinPoint.proceed(); // Мы вызываем таргет метод (returnBook)

        System.out.println("aroundReturnBookLoggingAdvice: book has benn returned to the library ...");
        return targetMethodResult;
    }*/

    // Example 2 working with Exceptions
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable { // proceedingJoinPoint обязателен и необходим для работы с таргет методом
        System.out.println("aroundReturnBookLoggingAdvice: trying to return book to the library ...");

        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed(); // Мы вызываем таргет метод (returnBook)
        } catch (Throwable e) {
            System.out.println("aroundReturnBookLoggingAdvice: exception " + e + " caught");
            targetMethodResult = "null";
        }

        System.out.println("aroundReturnBookLoggingAdvice: book has benn returned to the library ...");
        return targetMethodResult;
    }

}
