package com.employee.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.employee.entity.Department;

public class DepartmentDAO {

    Configuration configuration = new Configuration().configure();
    SessionFactory sessionFactory = configuration.buildSessionFactory();

    public void saveDepartment(Department department) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(department);

        transaction.commit();
        session.close();

        System.out.println("Department Saved Successfully");
    }

    public Department getDepartment(int id) {

        Session session = sessionFactory.openSession();

        Department department = session.get(Department.class, id);

        session.close();

        return department;
    }

    public void updateDepartment(Department department) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.merge(department);

        transaction.commit();
        session.close();

        System.out.println("Department Updated Successfully");
    }

    public void deleteDepartment(int id) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Department department = session.get(Department.class, id);

        if (department != null) {
            session.remove(department);
            System.out.println("Department Deleted Successfully");
        } else {
            System.out.println("Department Not Found");
        }

        transaction.commit();
        session.close();
    }

    public List<Department> getAllDepartments() {

        Session session = sessionFactory.openSession();

        List<Department> departments = session.createQuery("from Department", Department.class).list();

        session.close();

        return departments;
    }
}