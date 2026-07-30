package com.employee.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.employee.entity.Project;

public class ProjectDAO {

    Configuration configuration = new Configuration().configure();
    SessionFactory sessionFactory = configuration.buildSessionFactory();

    public void saveProject(Project project) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(project);

        transaction.commit();
        session.close();

        System.out.println("Project Saved Successfully");
    }

    public Project getProject(int id) {

        Session session = sessionFactory.openSession();

        Project project = session.get(Project.class, id);

        session.close();

        return project;
    }

    public void updateProject(Project project) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.merge(project);

        transaction.commit();
        session.close();

        System.out.println("Project Updated Successfully");
    }

    public void deleteProject(int id) {

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Project project = session.get(Project.class, id);

        if (project != null) {
            session.remove(project);
            System.out.println("Project Deleted Successfully");
        } else {
            System.out.println("Project Not Found");
        }

        transaction.commit();
        session.close();
    }

    public List<Project> getAllProjects() {

        Session session = sessionFactory.openSession();

        List<Project> projects = session.createQuery("from Project", Project.class).list();

        session.close();

        return projects;
    }
}