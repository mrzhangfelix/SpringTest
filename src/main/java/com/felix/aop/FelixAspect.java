package com.felix.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class FelixAspect {


    public void before(){
        System.out.println("this is before");
    }

    public void after(){
        System.out.println("this is after");
    }

    public void afterReturning(){
        System.out.println("this is afterReturning");
    }

    public void afterThrowing(){
        System.out.println("this is afterThrowing");
    }

    public void around(ProceedingJoinPoint jp){
        System.out.println("this is around1");
        try {
            jp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("this is around2");


    }

}
