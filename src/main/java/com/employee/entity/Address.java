package com.employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="address")
public class Address 
{
	@Id
    private int address_id;
	@Column(name = "city")
    private String city;
	@Column
    private String state;
	@Column
    private int pincode;
    
	@OneToOne(mappedBy = "address")
	private Employee employee;
	
	public Address(int address_id, String city, String state, int pincode) {
		super();
		this.address_id = address_id;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public Address() {
		super();
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Employee getEmployee() {
	    return employee;
	}

	public void setEmployee(Employee employee) {
	    this.employee = employee;
	}
	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", city=" + city + ", state=" + state + ", pincode=" + pincode
				+ "]";
	}
    
    
    
    

}
