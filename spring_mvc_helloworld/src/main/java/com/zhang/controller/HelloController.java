package com.zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

//    string返回逻辑视图

    @RequestMapping("/")
    public String protal(){
        //返回逻辑视图
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        return "successful";
    }

}
