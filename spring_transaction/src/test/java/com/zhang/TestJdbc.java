package com.zhang;

import com.zhang.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//指定当前测试类在spring的测试环境下运行，此时可以直接通过注入的方式直接获取ioc中的bean
@RunWith(SpringJUnit4ClassRunner.class)
//设置spring测试环境的配置文件
@ContextConfiguration("classpath:spring_jdbc.xml")
public class TestJdbc {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void testInsert(){
        String sql = "insert into t_user values(null,?,?,?,?,?)";
        jdbcTemplate.update(sql,"xiaohong","12343",24,"man","12321@qq.com");
    }

    @Test
    public void testSelect(){
        String sql = "select * from t_user where id = ? ";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), 1);
        System.out.println(user);
    }
}
