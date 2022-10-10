package com.zhang.controller;

import com.zhang.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;
}
