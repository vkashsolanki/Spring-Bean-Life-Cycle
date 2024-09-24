package com.learn.InitDestroyMethodByAnotation;

import java.beans.ConstructorProperties;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Employee{
	
	
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
	@PreDestroy
	public void destroy() throws Exception
	{
		System.out.println("Destroy method");
	}

	@PostConstruct
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("inti afterpropertiesset method");
		
	}
}
