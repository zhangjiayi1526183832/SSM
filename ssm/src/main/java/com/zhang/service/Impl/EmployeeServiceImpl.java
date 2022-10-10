package com.zhang.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhang.mapper.EmployeeMapper;
import com.zhang.pojo.Employee;
import com.zhang.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/** 访问首页 / get
 * 查询所有员工数据 /Employee get
 * 删除员工数据 /Employee/2 delete
 * 跳转到添加员工页面 /Employee/to/add get
 * 保存员工数据 /Employee post
 * 跳转到更新员工页面 /Employee/2 get
 * 执行更新 /Employee put
* */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        //开启分页功能
        PageHelper.startPage(pageNum,4);
        //查询所有员工信息
        List<Employee> list = employeeMapper.getAllEmployee();
        //获取分页数据
        PageInfo<Employee> page = new PageInfo<Employee>(list,5);
        return page;
    }
}
