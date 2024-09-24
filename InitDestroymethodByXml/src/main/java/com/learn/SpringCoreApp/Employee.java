package com.learn.SpringCoreApp;

public class Employee {
	
	
	private int id;
	private String name;
	
	public Employee() {
			System.out.println("Employee Constructor");
	}
	
	
	public int getId() {
		return id;
		
	}
	public void setId(int id) {
		this.id = id;
		System.out.println("setter method for id");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("setter method for name");
	}
	
	public void init()
	{
		System.out.println("init method");
	}
	
	public void destroy()
	{
		System.out.println("Destroy method");
	}
}
