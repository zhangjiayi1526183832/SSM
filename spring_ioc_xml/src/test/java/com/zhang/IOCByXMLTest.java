package com.zhang;

import com.zhang.pojo.Clazz;
import com.zhang.pojo.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IOCByXMLTest{
    @Test
    public void testIOC(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student studentOne = (Student) ioc.getBean("StudentOne");
        System.out.println(studentOne);
    }

    @Test
    public void test(){
        ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
//        Clazz clazzThree = ioc.getBean("ClazzThree", Clazz.class);
//        System.out.println(clazzThree);
        Student studentFive = ioc.getBean("StudentFive", Student.class);
        System.out.println(studentFive);
    }
}
