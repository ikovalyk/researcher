package com.rteam.researcher.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rteam.researcher.dao.EmployeeDAO;
import com.rteam.researcher.domain.Employee;
 
@Service
public class EmployeeServiceImpl implements EmployeeService {
 
    @Autowired
    private EmployeeDAO employeeDAO;
 
    @Transactional
    public void addEmployee(Employee employee) {
        employeeDAO.addEmployee(employee);
    }
 
    @Transactional
    public List<Employee> listEmployee() {
 
        return employeeDAO.listEmployee();
    }
 
    @Transactional
    public void removeEmployee(Integer id) {
        employeeDAO.removeEmployee(id);
    }
}