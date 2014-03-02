package com.rteam.researcher.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rteam.researcher.domain.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void addEmployee(Employee contact) {
        sessionFactory.getCurrentSession().save(contact);
    }

    @SuppressWarnings("unchecked")
    public List<Employee> listEmployee() {

        return sessionFactory.getCurrentSession().createQuery("from Contact")
            .list();
    }

    public void removeEmployee(Integer id) {
        Employee contact = (Employee) sessionFactory.getCurrentSession().load(
                Employee.class, id);
        if (null != contact) {
            sessionFactory.getCurrentSession().delete(contact);
        }

    }
}
