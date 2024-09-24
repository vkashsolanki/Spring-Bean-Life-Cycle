package com.orm.BeanlifeCycle.bean;

public class Employee {

	
	private int id;
	private String name;
	private String city;
	private double money;
	
	
	
	
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String toString()
	{
		return id+" "+name+" "+" "+city+" "+money;
	}
}
