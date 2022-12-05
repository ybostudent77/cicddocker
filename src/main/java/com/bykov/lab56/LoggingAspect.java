package com.bykov.lab56;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Before("execution(public String WebApp.printCourses())")
    public void beforeExecutionWebAppAdvice() {
        System.out.println("[log] enter point in getHTML");
    }

    @After("execution(public String WebApp.printCourses()) )")
    public void hhe() {
        System.out.println("[log] out point in getHTML");
    }
}
