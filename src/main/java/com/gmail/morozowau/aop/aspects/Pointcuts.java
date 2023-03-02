package com.gmail.morozowau.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;


public class Pointcuts {
    @Pointcut("execution(* get*())") // Объявление pointcut для многоразового его использования
    public void pointcut_reference() {
    }
}
