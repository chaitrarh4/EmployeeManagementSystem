package com.employee.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.employee.dao.AddressDAO;
import com.employee.dao.DepartmentDAO;
import com.employee.dao.EmployeeDAO;
import com.employee.dao.ProjectDAO;
import com.employee.entity.Address;
import com.employee.entity.Department;
import com.employee.entity.Employee;
import com.employee.entity.Project;

public class Main {

    public static void main(String[] args) {

//        // Department
//        Department department = new Department();
//      department.setDept_id(101);
// department.setDept_name("IT");
//department.setLocation("Bangalore");
//
////        // Address
//   Address address = new Address();
//    address.setAddress_id(1);
//       address.setCity("Bangalore");
//    address.setState("Karnataka");
//      address.setPincode(560001);
////
////        // Project
//   Project project = new Project();
//        project.setProject_id(201);
//      project.setProject_name("Employee Management");
//     project.setDescription("Hibernate Project");
//   project.setStart_date(new Date());
//       project.setEnd_date(new Date());
//        project.setBudget(500000);
//        project.setStatus("Running");
//       project.setClient_name("OpenAI");
//       project.setTechnology("Java Hibernate");
////
//      List<Project> projects = new ArrayList<>();
//      projects.add(project);
////
////        // Employee
//     Employee employee = new Employee();
//       employee.setId(1);
//       employee.setName("Chaitra");
//      employee.setSalary(50000);
//       employee.setEmail("chaitra1@gmail.com");
//      employee.setPhone("7019246071");
//
//  employee.setDepartment(department);
//        employee.setAddress(address);
//        employee.setProjects(projects);
////
////        // DAO Objects
//        DepartmentDAO departmentDAO = new DepartmentDAO();
//        AddressDAO addressDAO = new AddressDAO();
//        ProjectDAO projectDAO = new ProjectDAO();
//        EmployeeDAO employeeDAO = new EmployeeDAO();
////
////        // Save in order
//        departmentDAO.saveDepartment(department);
//        addressDAO.saveAddress(address);
//       projectDAO.saveProject(project);
//       employeeDAO.saveEmployee(employee);
//
//     System.out.println("Data Inserted Successfully");
        
   	EmployeeDAO e = new EmployeeDAO();
    	e.getAllEmployees();
    }
}