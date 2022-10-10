package com.zhang;

import com.zhang.controller.UserController;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireByXMLTest {
    @Test
    public void testAutoWire(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-autowire-xml.xml");
        UserController userController = ioc.getBean(UserController.class);
        userController.saveUser();
    }
}
