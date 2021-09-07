package com.example.demo.aspects;

import javax.annotation.PreDestroy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect2 {
    // if same point cut, sortet by the function name alphabet
    // @Before("execution(public * *(..))")
    // void handleAll() {
    // System.out.println("Before All");
    // }
    // @Before("execution(public void addAccount())")
    // void aHandleBeforeAddingAccount2() {
    // System.out.println("A Before Aspect 2");
    // }
    // int isCalled;

    // DemoLoggingAspect2() {
    //     this.isCalled = 0;

    // }

    // private synchronized void increaseInterception() {
    //     this.isCalled++;
    // }

    // @Before("execution(public void addAccount*(com.example.demo.Account, int, ..))")
    // void handleBeforeAddingAccountClass() {
    //     increaseInterception();
    //     System.out.println("Common Before Aspect, adding Account Class argument with integer");
    // }

    // @Before("execution(* com.example.demo.dao.*.*(..))")
    // void handleBeforeAllDAO() {
    //     increaseInterception();
    //     System.out.println("Handle All Before in DAO");
    // }

    // @PreDestroy
    // void handleDestroy() {
    //     System.out.println("Num of interception: " + this.isCalled);
    // }
}
