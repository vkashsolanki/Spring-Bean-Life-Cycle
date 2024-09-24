package com.learn.InitDestroyMethodByjava;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean{
	
	
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


	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inti afterpropertiesset method");
		
	}
}
