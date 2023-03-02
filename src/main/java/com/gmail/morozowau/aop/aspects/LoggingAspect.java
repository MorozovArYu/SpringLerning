package com.gmail.morozowau.aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public void getBook())") // pointcut Говорит, когда должен выполняться сквозной код
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: try to get book");
    }
}
