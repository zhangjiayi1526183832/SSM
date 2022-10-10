package com.zhang;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {
    @Test
    public void test(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-aop-annotation.xml");
        Calculator bean = ioc.getBean(Calculator.class);
        bean.div(1,1);
    }
}
