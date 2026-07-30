package com.employee.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name ="project")
public class Project
{
	@Id
	private int  project_id;
	@Column
	
	private String project_name;
	@Column
	
	private String description;
	@Column
	private Date start_date;
	@Column
	private Date end_date;
	@Column
	private int budget;
	@Column
	private String status;
	@Column
	private String client_name;
	@Column
	private String technology;
	
	
	public Project() {
		super();
	}
	public Project(int project_id, String project_name, String description, Date start_date, Date end_date, int budget,
			String status, String client_name, String technology) {
		super();
		this.project_id = project_id;
		this.project_name = project_name;
		this.description = description;
		this.start_date = start_date;
		this.end_date = end_date;
		this.budget = budget;
		this.status = status;
		this.client_name = client_name;
		this.technology = technology;
	}
	
	  
	@ManyToMany(mappedBy = "projects")
	private List<Employee> employees;
	public int getProject_id() {
		return project_id;
	}
	public void setProject_id(int project_id) {
		this.project_id = project_id;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public int getBudget() {
		return budget;
	}
	public void setBudget(int budget) {
		this.budget = budget;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getClient_name() {
		return client_name;
	}
	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	@Override
	public String toString() {
		return "Project [project_id=" + project_id + ", project_name=" + project_name + ", description=" + description
				+ ", start_date=" + start_date + ", end_date=" + end_date + ", budget=" + budget + ", status=" + status
				+ ", client_name=" + client_name + ", technology=" + technology + "]";
	}
	
	
}
