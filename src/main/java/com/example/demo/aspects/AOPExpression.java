package com.example.demo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

//@Aspect
public class AOPExpression {
    @Pointcut("execution(* com.example.demo.dao.*.*(..))")
    // should be a variale-name
    public void allDAOPointcut() {
    }
    @Pointcut("execution(* com.example.demo.dao.*.throw*(..))")
    public void allThrowDAOPointcut(){}

    @Pointcut("allDAOPointcut() && !allThrowDAOPointcut()")
    public void allDAOPointcutNotThrow(){}

    @Pointcut("execution(* com.example.demo.dao.*.get*(..))")
    public void allGetterDAO() {
    }

    @Pointcut("execution(* com.example.demo.dao.*.set*(..))")
    public void allSetterDAO() {
    }

    @Pointcut("execution(* com.example.demo.dao.*.find*(..))")
    public void allFindDAO() {
    }

}
