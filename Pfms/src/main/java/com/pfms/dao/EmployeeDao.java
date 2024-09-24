package com.pfms.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.pfms.entity.Employee;

public class EmployeeDao {
	
	private HibernateTemplate hibernateTemplate;
	
	
	// get all data 
	
	public List<Employee> getAllEmployee()
	{
		List<Employee> list = this.hibernateTemplate.loadAll(Employee.class);
		System.out.println(list);
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	

}
