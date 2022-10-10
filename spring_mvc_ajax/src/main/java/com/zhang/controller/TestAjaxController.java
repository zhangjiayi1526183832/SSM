package com.zhang.controller;

import com.zhang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@Controller
public class TestAjaxController {
    @RequestMapping("/test/ajax")
    public void testAjax(Integer id, HttpServletResponse response, @RequestBody String requestbody) throws IOException {
        System.out.println(id);
        System.out.println(requestbody);
        response.getWriter().write("hello,axios");
    }

    @RequestMapping("/test/RequestBody/json")
    public void testRequestBody( @RequestBody User user,HttpServletResponse response) throws IOException {
        response.getWriter().write("hello,json");
        System.out.println(user);
    }

    public void testRequestBody(@RequestBody Map<String,Object> map,HttpServletResponse response ) throws IOException {
        response.getWriter().write("hello,json");
        System.out.println(map);
    }

    @RequestMapping("/test/ResponseBody")
    @ResponseBody
    public String testResponseBody(){
        return "success";
    }

    @RequestMapping("/test/ResponseBody/json")
    @ResponseBody
    public User testResponseBodyJson(){
        User user = new User(1001, "admin", "123456", 20, "男");
        return user;
    }

    
}
