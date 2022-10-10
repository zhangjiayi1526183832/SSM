package com.zhang.mapper;

import com.zhang.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SpecialSQLMapper {
//    模糊查询
    List<User> getUserByLike(@Param("mohu") String mohu);
//    批量删除
    void deleteMoreUser(@Param("ids") String ids);
//    动态设置表名
    List<User> getUserList(@Param("tableName") String tableName);
//    添加用户信息并获取自增主键
    void insertUser(User user);
}
