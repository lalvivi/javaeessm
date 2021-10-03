package com.bjpowernode.controller;

import com.bjpowernode.bean.Employee;
import com.bjpowernode.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    private String tips;
    @RequestMapping("/insert")
    public  String insert (Employee employee, Model model){
        int insert = employeeService.insert(employee);
        if (insert>0){
            tips="添加成功";

        }else {
            tips="添加失败";
        }
        model.addAttribute("tips" ,tips);
        return "result";
    }

    @RequestMapping("/query")
    @ResponseBody
    public List<Employee> query(){
        List<Employee> employee= employeeService.query();
        return employee;
    }
}
