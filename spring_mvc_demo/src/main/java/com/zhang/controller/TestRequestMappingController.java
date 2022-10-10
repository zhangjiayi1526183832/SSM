package com.zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestRequestMappingController {
    @RequestMapping(
            value = {"/hello","/abc"},
            method = {RequestMethod.GET},
//            params = {"username","!password","age=20","gender!=女"}
            headers = {"referer"}
    )

    public String hello(){
        return "successful";
    }

    @RequestMapping("/a*a/test/ant")
    public String testAnt(){
        return "successful";
    }
//    ?表示任何单个字符,但不能表示?
//    *表示0个或多个字符,但不能表示?与/
//    **表示任意层数的目录,不能表示? 使用方式只能是/**/

    @RequestMapping("/test/rest/{username}/{id}")
    public String testRest(@PathVariable("id") Integer id,@PathVariable("username") String username){
        System.out.println("id:"+id);
        System.out.println("username:"+username);
        return "successful";
    }
}
