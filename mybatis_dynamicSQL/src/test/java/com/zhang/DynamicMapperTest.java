package com.zhang;

import com.zhang.mapper.DynamicSQLMapper;
import com.zhang.pojo.Emp;
import com.zhang.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DynamicMapperTest {
    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "张三", 17, "男");
        List<Emp> empByCondition = mapper.getEmpByCondition(emp);
        empByCondition.forEach(System.out::println);
    }

    @Test
    public void testGetEmpByChoose(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "张三", 17, "男");
        List<Emp> empByCondition = mapper.getEmpByChoose(emp);
        empByCondition.forEach(System.out::println);
    }

    @Test
    public void testInsertMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "白起", 17, "男");
        Emp emp2 = new Emp(null, "嬴政", 17, "男");
        Emp emp3 = new Emp(null, "廉颇", 17, "男");
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3);
        mapper.insertMoreEmp(emps);
    }

    @Test
    public void testDeleteMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Integer[] integer = new Integer[]{6,7};
        mapper.deleteMoreEmp(integer);
    }
}
