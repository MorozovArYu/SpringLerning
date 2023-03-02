package com.gmail.morozowau.aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LoggingAspect {

    /*@Before("execution(public void getBook())") // pointcut Говорит, когда должен выполняться сквозной код
    public void beforeGetBookAdvice1() {
        System.out.println("beforeGetBookAdvice1: try to get book");
    } // first example*/

    /*@Before("execution(public void com.gmail.morozowau.aop.UniLibrary.getBook())") // pointcut Говорит, сквозной код выполняется только на методе из класса UniLibrary
    public void beforeGetBookAdvice2() {
        System.out.println("beforeGetBookAdvice2: try to get book");
    } // second example*/

    /*@Before("execution(public void get*())") // pointcut Говорит, сквозной код выполняется только на всех методах где в названии есть get
    public void beforeGetBookAdvice3() {
        System.out.println("beforeGetBookAdvice3: try to get something");
    } // third example*/

    /*@Before("execution(* *(*))") // pointcut Говорит, сквозной код выполняется на любых методах c одним параметром
    public void beforeReturnBookAdvice() {
        System.out.println("beforeReturnBookAdvice: try to get something");
    } // fourth example*/

    /*@Before("execution(void getBook(String)))") // pointcut Говорит, сквозной код выполняется на методах getBook с одним параметром String
    public void beforeGetBookAdvice4() {
        System.out.println("beforeGetBookAdvice4: try to get something");
    } // fives example*/

    /*@Before("execution(* *(..)))") // pointcut Говорит, сквозной код выполняется на любых методах (* и .. - wildcard)
    public void beforeGetBookAdvice5() {
        System.out.println("beforeGetBookAdvice5: try to get something");
    } // sixes example*/

    @Before("execution(* getBook(com.gmail.morozowau.aop.Book))")
    public void beforeGetBookAdvice6() {
        System.out.println("beforeGetBookAdvice6: try to get something");
    } // sixes example
}
