package com.zhang;

import com.zhang.mapper.CacheMapper;
import com.zhang.pojo.Emp;
import com.zhang.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.lf5.util.Resource;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class CacheMapperTest {
    @Test
    public void testGetEmpById() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        CacheMapper mapper = sqlSession.getMapper(CacheMapper.class);
        Emp empById = mapper.getEmpById(1);
        System.out.println(empById);
        sqlSession.clearCache();//手动清空一级缓存
    }

    @Test
    public void testCache() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession1= build.openSession(true);
        CacheMapper mapper1 = sqlSession1.getMapper(CacheMapper.class);
        Emp empById1 = mapper1.getEmpById(1);
        System.out.println(empById1);
        SqlSession sqlSession2= build.openSession(true);
        CacheMapper mapper2 = sqlSession1.getMapper(CacheMapper.class);
        Emp empById2 = mapper2.getEmpById(1);
        System.out.println(empById2);
    }
}
