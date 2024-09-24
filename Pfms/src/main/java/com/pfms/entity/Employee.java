package com.pfms.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Employee {
    
	@Id
	private int id;
	private String name;
	private String address;
	private long number;
	
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", number=" + number + "]";
	}
	
	
}
