package com.rteam.researcher.service;

import java.util.List;

import com.rteam.researcher.domain.Employee;

public interface EmployeeService {

    public void addEmployee(Employee contact);

    public List<Employee> listEmployee();

    public void removeEmployee(Integer id);
}