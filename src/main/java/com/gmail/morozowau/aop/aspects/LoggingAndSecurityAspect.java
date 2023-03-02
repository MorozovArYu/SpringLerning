package com.gmail.morozowau.aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAndSecurityAspect {

    // Pointcut declaration
    /*@Pointcut("execution(* get*())") // Объявление pointcut для многоразового его использования
    private void pointcut_reference() {
    }*/

/*    @Pointcut("execution(* com.gmail.morozowau.aop.UniLibrary.get*())")
    private void allGetMethodsFromUniLibrary() {
    }

    @Pointcut("execution(* com.gmail.morozowau.aop.UniLibrary.return*())")
    private void allReturnMethodsFromUniLibrary() {
    }

    first example of pointcut combining
    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()") // группировка pointcut (pointcut combining)
    private void allGetOrReturnMethodsFromUniLibrary() {
    }*/


/*    @Before("pointcut_reference()")
    public void BeforeGetLoggingAdvice() {
        System.out.println("Logging ...");
    }

    @Before("pointcut_reference()")
    public void BeforeGetSecurityAdvice() {
        System.out.println("Rights checking ...");
    }*/

    /*@Before("allGetMethodsFromUniLibrary()") // г
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing Log #1");
    }*/

    /*@Before("allReturnMethodsFromUniLibrary()")
    public void beforeReturnLoggingAdvice() {
        System.out.println("beforeReturnLoggingAdvice: writing Log #2");
    }*/

    /*@Before("allGetOrReturnMethodsFromUniLibrary()")
    public void beforeGetOrReturnLoggingAdvice() {
        System.out.println("beforeGetOrReturnLoggingAdvice: writing Log #3");
    }*/

/*    @Before("allGetMethodsFromUniLibrary()")
    public void beforeGetSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice: writing Log #1");
    }*/

    // Second example of pointcut combining
    @Pointcut("execution(* com.gmail.morozowau.aop.UniLibrary.*(..))")
    private void beforeAnyMethod(){}

    @Pointcut("execution(public void com.gmail.morozowau.aop.UniLibrary.returnMagazine())")
    private void beforeReturnMagazine(){}

    @Pointcut("beforeAnyMethod() && !beforeReturnMagazine()")
    private void beforeAnyMethodExceptReturnMagazine(){}

    @Before("beforeAnyMethodExceptReturnMagazine()")
    public void beforeLoggingAdvice(){
        System.out.println("beforeLoggingAdvice: Logging ...");
    }
}
