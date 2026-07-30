package com.employee.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.employee.entity.Employee;

public class EmployeeDAO {

    Configuration configuration = new Configuration().configure();
    SessionFactory sessionFactory = configuration.buildSessionFactory();

    // Insert
    public void saveEmployee(Employee employee) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(employee);

        transaction.commit();
        session.close();

        System.out.println("Employee Saved Successfully");
    }

    // Get By Id
    public Employee getEmployee(int id) {

        Session session = sessionFactory.openSession();

        Employee employee = session.get(Employee.class, id);

        session.close();

        return employee;
    }

    // Update
    public void updateEmployee(Employee employee) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.merge(employee);

        transaction.commit();
        session.close();

        System.out.println("Employee Updated Successfully");
    }

    // Delete
    public void deleteEmployee(int id) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = session.get(Employee.class, id);

        if (employee != null) {
            session.remove(employee);
            System.out.println("Employee Deleted Successfully");
        } else {
            System.out.println("Employee Not Found");
        }

        transaction.commit();
        session.close();
    }

    public void getAllEmployees() {

        Session session = sessionFactory.openSession();

        List<Employee> employees = session.createQuery("from Employee", Employee.class).list();

        if (employees.isEmpty()) {
            System.out.println("No Employees Found");
        } else {
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }

        session.close();
    }
}