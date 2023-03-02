package com.gmail.morozowau.aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import com.gmail.morozowau.aop.aspects.Pointcuts.*;


@Component
@Aspect
@Order(1)
public class LoggingAspect {
    // Pointcut declaration


    @Before("com.gmail.morozowau.aop.aspects.Pointcuts.pointcut_reference()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: Logging ...");
    }


}
