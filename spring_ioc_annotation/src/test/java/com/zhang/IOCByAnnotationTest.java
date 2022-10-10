package com.zhang;

import com.zhang.controller.UserController;
import com.zhang.dao.impl.UserDaoImpl;
import com.zhang.service.UserService;
import com.zhang.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCByAnnotationTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = ioc.getBean(UserController.class);
        System.out.println(userController);
        UserServiceImpl userService = ioc.getBean(UserServiceImpl.class);
        System.out.println(userService);
        UserDaoImpl userDao = ioc.getBean(UserDaoImpl.class);
        System.out.println(userDao);
    }
}
