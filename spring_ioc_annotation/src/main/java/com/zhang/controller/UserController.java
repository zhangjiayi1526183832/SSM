package com.zhang.controller;

import com.zhang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void saveUser(){
        userService.saveUser();
    }
}
