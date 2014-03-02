package com.rteam.researcher.dao;

import java.util.List;
import com.rteam.researcher.domain.Employee;

public interface EmployeeDAO {

    public void addEmployee(Employee employee);

    public List<Employee> listEmployee();

    public void removeEmployee(Integer id);
}
