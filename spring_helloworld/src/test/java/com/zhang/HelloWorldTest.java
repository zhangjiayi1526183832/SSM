package com.zhang;

import com.zhang.pojo.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
    @Test
    public void testHelloWorld(){
        //创建ioc容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //根据iosc容器创建bean
        HelloWorld helloworld = (HelloWorld) ioc.getBean("helloworld");
        helloworld.hello();
    }
}
