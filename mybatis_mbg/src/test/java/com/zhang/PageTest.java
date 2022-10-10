package com.zhang;

import com.github.pagehelper.PageHelper;
import com.zhang.mapper.EmpMapper;
import com.zhang.pojo.Emp;
import com.zhang.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class PageTest {
    @Test
    public void testPage(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        PageHelper.startPage(1,4);
        List<Emp> emps = mapper.selectByExample(null);
        emps.forEach(System.out::println);
    }
}
