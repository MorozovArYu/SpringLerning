package com.gmail.morozowau.aop.aspects;


import com.gmail.morozowau.aop.Book;
import com.gmail.morozowau.aop.Student;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Aspect
public class UniversityLoggingAspect {
    // Pointcut declaration
/*    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: Logging students before method getStudents ...");
    }*/

    // Example 1
    /*@AfterReturning(pointcut = "execution(* getStudents())", returning = "anyName") // Указываем returning для того, чтобы изменить return в методах соответствующих pointcut
    public void afterReturningGetStudentsLoggingAdvice(List<Student> anyName){ // Для этого необходимо указать в параметрах метода возвращаемый тип в методах по pointcut
        Student student1 = anyName.get(0);

        String nameSerName = student1.getNameSerName();
        nameSerName = "Mr. " + nameSerName;
        student1.setNameSerName(nameSerName);

        double avgGrade = student1.getAvgGrade();
        avgGrade = avgGrade + 1d;
        student1.setAvgGrade(avgGrade);


        System.out.println("afterReturningGetStudentsLoggingAdvice: Logging students after returning method getStudents ...");
    }*/

    // Example 2
    /*@AfterThrowing(pointcut = "execution(* getStudents())", throwing = "anyName") // Мы можем получить информацию об исключении
    public void afterThrowingGetStudentsLoggingAdvice(Throwable anyName){ // Так же как и в AfterReturning
        System.out.println("afterThrowingGetStudentsLoggingAdvice: Logging exception throwing ...");
        System.out.println(anyName);
    }*/

    //Example 3
    /*@After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice Logging normal end's of method or exception throwing");
    }*/




}
