package com.example.demo.aspects;

import javax.annotation.PreDestroy;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoLoggingAspect {
    // if same point cut, order us undefined
    // @Before("execution(public * *(..))")
    // void handleAll() {
    // System.out.println("Before All");
    // }
    // @Before("execution(public void addAccount())")
    // void aHandleBeforeAddingAccount2() {
    // System.out.println("A Before Aspect 2");
    // }
    // int isCalled;

    // DemoLoggingAspect() {
    //     this.isCalled = 0;

    // }

    // private synchronized void increaseInterception() {
    //     this.isCalled++;
    // }

    // @Before("execution(public void addAccount*())")
    // void handleBeforeAddingAccount() {
    //     increaseInterception();
    //     System.out.println("Common Before Aspect");
    // }

    // @Before("execution(public void addAccount*(com.example.demo.Account))")
    // void handleBeforeAddingAccountClass() {
    //     increaseInterception();
    //     System.out.println("Common Before Aspect, adding Account Class argument");
    // }

    // @Before("execution(public * com.example.demo.dao.AccountDAO.addAccount())")
    // void handleOnlyBeforeAddingAccountDAO() {
    //     increaseInterception();
    //     System.out.println("Before Aspect: handleOnlyBeforeAddingAccountDAO");
    //     return;
    // }

    // @PreDestroy
    // void handleDestroy() {
    //     System.out.println("Num of interception: " + this.isCalled);
    // }
}
