package com.zhang;

import com.zhang.controller.BookController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/*
* 声明式事务配置步骤
* 1，在spring的配置文件中配置事务管理器
* 2，开启事务的注解驱动
* 3，在需要被事务管理的方法上添加@Transactional注解，方法就会被事务管理 把注解写在服务层*/


//指定当前测试类在spring的测试环境下运行，此时可以直接通过注入的方式直接获取ioc中的bean
@RunWith(SpringJUnit4ClassRunner.class)
//设置spring测试环境的配置文件
@ContextConfiguration("classpath:tx.xml")
public class TxByAnnotationTest {
    @Autowired
    private BookController bookController;

    @Test
    public void testBuyBook(){
        bookController.checkout(1,new Integer[]{1,2});
    }
}
