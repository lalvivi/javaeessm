package com.bjpowernode.dao;

import com.bjpowernode.bean.Employee;

import java.util.List;

public interface EmployeeDao {
    int insert(Employee employee);
    List<Employee> query();
}
