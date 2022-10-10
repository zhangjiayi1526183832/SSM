package com.zhang;

import com.zhang.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanTest {
    @Test
    public void testFactoryBean()
    {
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-factory.xml");
        User bean = ioc.getBean(User.class);
        System.out.println(bean);
    }
}
