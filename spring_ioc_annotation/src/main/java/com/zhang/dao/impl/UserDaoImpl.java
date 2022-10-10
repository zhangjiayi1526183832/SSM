package com.zhang.dao.impl;

import com.zhang.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
    public void saveUser() {
        System.out.println("保存成功");
    }
}
