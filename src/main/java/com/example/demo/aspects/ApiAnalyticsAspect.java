package com.example.demo.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(2)
public class ApiAnalyticsAspect {
    // @Before("com.example.demo.aspects.AOPExpression.allDAOPointcut()")
    // void handleAllBeforeDAO() {
    //     System.out.println("Before API Analytics Aspect");
    // }

}
