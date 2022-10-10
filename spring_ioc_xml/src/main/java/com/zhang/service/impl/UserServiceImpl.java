package com.zhang.service.impl;

import com.zhang.dao.UserDao;
import com.zhang.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void saveUser() {
        userDao.saveUser();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
