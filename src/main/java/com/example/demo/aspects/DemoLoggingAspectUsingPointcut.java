package com.example.demo.aspects;

import java.util.List;

import com.example.demo.Account;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(value = 1)
public class DemoLoggingAspectUsingPointcut {

    // @Before("com.example.demo.aspects.AOPExpression.allGetterDAO() ||
    // com.example.demo.aspects.AOPExpression.allSetterDAO()")
    // void handleAllBeforeSetterGetterDAO() {
    // System.out.println("Before All setter and getter");
    // }

    // refer to one point cut
    int interception;

    @Before("com.example.demo.aspects.AOPExpression.allDAOPointcutNotThrow()")
    void handleAllBeforeDAO(JoinPoint joinPoint) {

        interception++;
        System.out.println("--------------------- " + interception + " ------------------------------");
        System.out.println(joinPoint);
        System.out.println(joinPoint.getArgs());
        System.out.println(joinPoint.getSignature());
        System.out.println("Before all DAO Logging");
    }

    @AfterReturning(pointcut = "com.example.demo.aspects.AOPExpression.allDAOPointcutNotThrow()", returning = "result")
    void handleAfterFindDAO(JoinPoint joinPoint, List<Account> result) {
        result.add(new Account("Dummy", "Silver"));
        for (Account a : result) {
            a.setName(a.getName().toUpperCase());
            a.setLevel(a.getLevel().toUpperCase());
        }

    }

    @AfterThrowing(pointcut = "com.example.demo.aspects.AOPExpression.allThrowDAOPointcut()", throwing = "theExp")
    void handleAfterThrowingDAO(JoinPoint joinPoint, Exception theExp) {

        String method = joinPoint.getSignature().toShortString();
        System.out.println("---------------------------------------------");
        System.out.println("After Throwing on method: " + method);

        System.out.println("After Throwing Exception: " + theExp);
    }

}
