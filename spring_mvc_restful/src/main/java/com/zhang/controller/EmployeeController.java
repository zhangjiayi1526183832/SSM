package com.zhang.controller;

import com.zhang.dao.EmployeeDao;
import com.zhang.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/*
* 访问首页 / get
* 查询所有员工数据 /Employee get
* 删除员工数据 /Employee/2 delete
* 跳转到添加员工页面 /Employee/to/add get
* 保存员工数据 /Employee post
* 跳转到更新员工页面 /Employee/2 get
* 执行更新 /Employee put
* */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String getAllEmployee(Model model){
        //获取数据
        Collection<Employee> allemployee = employeeDao.getAll();
        //请求域共享数据
        model.addAttribute("allemployee",allemployee);
        return "employee_list";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.POST)
    public String addEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }

    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
    public String toUpdate(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee",employee);
        return "employee_update";
    }

    @RequestMapping(value = "/employee",method = RequestMethod.PUT)
    public String updateEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }

    @RequestMapping(value = "/employee/{id}",method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/employee";
    }
}
