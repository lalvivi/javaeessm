package com.bjpowernode.service;

import com.bjpowernode.bean.Employee;

import java.util.List;

public interface EmployeeService {
    int insert(Employee employee);
    List<Employee> query();
}
