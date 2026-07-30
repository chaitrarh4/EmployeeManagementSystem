package com.employee.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class Department 
{
	@Id
   int dept_id;
	@Column(name = "dept_name",nullable = false,length = 50)
   String dept_name;
	
	@Column(name = "location",nullable = false,length = 100)
   String location;
   
	@OneToMany(mappedBy = "department")
	private List<Employee> employees;
   
   public Department() {
	super();
}
   public Department(int dept_id, String dept_name, String location) {
	super();
	this.dept_id = dept_id;
	this.dept_name = dept_name;
	this.location = location;
}
   public int getDept_id() {
	return dept_id;
   }
   public void setDept_id(int dept_id) {
	this.dept_id = dept_id;
   }
   public String getDept_name() {
	return dept_name;
   }
   public void setDept_name(String dept_name) {
	this.dept_name = dept_name;
   }
   public String getLocation() {
	return location;
   }
   public void setLocation(String location) {
	this.location = location;
   }
   @Override
	public String toString() {
		return "Department [dept_id=" + dept_id + ", dept_name=" + dept_name + ", location=" + location + "]";
	}
   
}
