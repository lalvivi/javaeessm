package com.bjpowernode.service.impl;

import com.bjpowernode.bean.Employee;
import com.bjpowernode.dao.EmployeeDao;
import com.bjpowernode.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public int insert(Employee employee) {
      int num= employeeDao.insert(employee);
      return num;

    }

    @Override
    public List<Employee> query() {

        return employeeDao.query();
    }
}
