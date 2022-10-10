package com.zhang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class TestScopeController {
    @RequestMapping("/test/mav")
    public ModelAndView testMAV(){
        /*
        * model:向请求域中共享数据
        * view:设置逻辑视图
        * */
        ModelAndView mav = new ModelAndView();
//        向请求域中共享数据
        mav.addObject("testRequestScope","hello,ModelAndView");
        mav.setViewName("successful");
        return mav;
    }

    @RequestMapping("/test/model")
    public String testModel(Model model){
        model.addAttribute("testRequestScope","hello,Model");
        return "successful";
    }

    @RequestMapping("/test/modelmap")
    public String testModelMap(ModelMap modelmap){
        modelmap.addAttribute("testRequestScope","hello,ModelMap");
        return "successful";
    }

    @RequestMapping("/test/map")
    public String testMap(Map<String,Object> map){
        map.put("testRequestScope","hello,Map");
        return "successful";
    }

    @RequestMapping("/test/session")
    public String testSession(HttpSession session){
        session.setAttribute("testSessionScope","hello,session");
        return "successful";
    }

    @RequestMapping("/test/application")
    public String testApplication(HttpSession session){
        ServletContext servletContext = session.getServletContext();
        servletContext.setAttribute("testApplicationScope","hello,Application");
        return "successful";
    }
}
