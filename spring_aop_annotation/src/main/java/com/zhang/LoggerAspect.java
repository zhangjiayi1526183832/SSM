package com.zhang;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect //将组件标识为切面
public class LoggerAspect {
    @Pointcut("execution(* com.zhang.CalculatorImpl.*(..))") //设置公共切点
    void pointCut(){}


//    @Before:前置通知：在目标对象方法执行之前执行
//    @Before("execution(public int com.zhang.CalculatorImpl.add(int,int))")
//    @Before("execution(* com.zhang.CalculatorImpl.*(..))")
    @Before("pointCut()")
    public void beforeAdviceMethod(JoinPoint joinPoint)
    {
        Signature signature = joinPoint.getSignature();//获取连接点对应的方法的签名信息
        System.out.println("前置通知：方法："+signature.getName()+",参数："+ Arrays.toString(joinPoint.getArgs()));
    }

    //@After:后置通知：在目标对象方法的finally字句中执行
    @After("pointCut()")
    public void afterAdviceMethod(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println("后置：方法："+signature.getName()+",参数："+ Arrays.toString(joinPoint.getArgs()));
    }

    //@AfterReturning:返回通知：在目标对象返回值之后执行
    //通过注解的returning属性，即可设置方法返回的结果
    @AfterReturning(value = "pointCut()",returning = "result")
    public void afterReturningAdviceMethod(JoinPoint joinPoint, Object result) {
        Signature signature = joinPoint.getSignature();
        System.out.println("返回通知：方法："+signature.getName()+",结果："+result);
    }

    //@AfterThrowing:后置通知：在目标对象方法的catch字句中执行
    //通过注解的throwing属性，即可设置异常
    @AfterThrowing(value = "pointCut()",throwing = "exception")
    public void afterThrowingAdviceMethod(JoinPoint joinPoint,Exception exception) {
        Signature signature = joinPoint.getSignature();
        System.out.println("异常通知：方法："+signature.getName()+",异常"+exception);
    }

    @Around("pointCut()")
    public Object aroundAdviceMethod(ProceedingJoinPoint joinPoint)
    {
        Object result = null  ;
        try {
            System.out.println("前置通知");
            result = joinPoint.proceed(); //表示目标对象方法的执行
            System.out.println("返回通知");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            System.out.println("异常通知");
        } finally {
            System.out.println("后置通知");
        }

        return result;
    }
}
