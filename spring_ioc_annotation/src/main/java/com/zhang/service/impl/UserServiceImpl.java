package com.zhang.service.impl;

import com.zhang.dao.UserDao;
import com.zhang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public void saveUser() {
        userDao.saveUser();
    }

}
