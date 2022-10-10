package com.zhang;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)    //设置切面优先级，数字越小，优先级越高 默认值为Inteager的最大值                                                                               
public class ValidateAspect {
    @Before("com.zhang.LoggerAspect.pointCut()")
    public void beforeMethod(){
        System.out.println("ValidateAspect---前置通知");
    }
}
