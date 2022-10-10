package com.zhang.controller;

import com.zhang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class TestParamController {
    @RequestMapping("/param/ServlerAPI")
    public String getParamByServletAPI(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        return "successful";
    }

    @RequestMapping("/param")
    public String getParam(@RequestParam("username") String username, String password){
        System.out.println(username);
        System.out.println(password);
        return "successful";
    }

    @RequestMapping("/param/pojo")
    public String getParamByPojo(User user){
        System.out.println(user);
        return "successful";
    }
}
