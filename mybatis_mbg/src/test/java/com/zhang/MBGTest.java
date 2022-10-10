package com.zhang;

import com.zhang.mapper.EmpMapper;
import com.zhang.pojo.Emp;
import com.zhang.pojo.EmpExample;
import com.zhang.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class MBGTest {
    @Test
    public void testMBG()
    {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        Emp emp = mapper.selectByPrimaryKey(1);
//        System.out.println(emp);  根据主键查询
//        List<Emp> emps = mapper.selectByExample(null);
//        emps.forEach(System.out::println);  不加条件查询
//        EmpExample empExample = new EmpExample();
//        empExample.createCriteria().andEmpNameEqualTo("张三").andAgeGreaterThanOrEqualTo(10);
//        List<Emp> emps = mapper.selectByExample(empExample);
//        emps.forEach(System.out::println);   根据名字查询

    }
}
