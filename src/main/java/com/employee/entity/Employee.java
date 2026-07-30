package com.employee.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee
{
	@Id
	@Column(name ="emp_id")
  private int id;
	
	@Column(name ="emp_name",nullable = false,length = 50)
  private String name;
	
	@Column
  private double salary;
	
	@Column(unique = true)
  private String email;
	
	@Column(name = "emp_phone",length = 10)
  private String phone;
  
	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Department department;
	
	@OneToOne
	@JoinColumn(name = "address_id")
	private Address address;
	
	@ManyToMany
	@JoinTable(
	    name = "employee_project",
	    joinColumns = @JoinColumn(name = "emp_id"),
	    inverseJoinColumns = @JoinColumn(name = "project_id")
	)
	private List<Project> projects;
	
	
	
	
  public Employee(int id, String name, double salary, String email, String phone) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.email = email;
	this.phone = phone;
  }
  public Employee() {
	super();
  }
  public int getId() {
	return id;
  }
  public void setId(int id) {
	this.id = id;
  }
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public double getSalary() {
	return salary;
  }
  public void setSalary(double salary) {
	this.salary = salary;
  }
  public String getEmail() {
	return email;
  }
  public void setEmail(String email) {
	this.email = email;
  }
  public String getPhone() {
	return phone;
  }
  public void setPhone(String phone) {
	this.phone = phone;
  }
  public Department getDepartment() {
	    return department;
	}

	public void setDepartment(Department department) {
	    this.department = department;
	}
	
	public Address getAddress() {
	    return address;
	}

	public void setAddress(Address address) {
	    this.address = address;
	}

	public List<Project> getProjects() {
	    return projects;
	}

	public void setProjects(List<Project> projects) {
	    this.projects = projects;
	}
	@Override
	public String toString() {
	    return "Employee [id=" + id +
	            ", name=" + name +
	            ", salary=" + salary +
	            ", email=" + email +
	            ", phone=" + phone +
	            ", department=" + department +
	            ", address=" + address +
	            ", projects=" + projects +
	            "]";
	}
  
  
}
