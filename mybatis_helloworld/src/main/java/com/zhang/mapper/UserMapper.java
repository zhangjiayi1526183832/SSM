package com.zhang.mapper;

import com.zhang.pojo.User;

import java.util.List;

public interface UserMapper {
    int insertUser();
    int updateUser();
    int deleteUser();
    User getUserById();
    List<User> getAllUser();
}
