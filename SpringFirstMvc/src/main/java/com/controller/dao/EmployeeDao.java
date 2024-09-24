package com.controller.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.controller.connection.FactoryProvider;
import com.controller.model.Employee;



public class EmployeeDao {
	
	
	public static void saveEmployee(Employee employee)
	
	
	{
		
		SessionFactory factory = FactoryProvider.getFactory();
		Session openSession = factory.openSession();
		openSession.save(employee);	
		openSession.beginTransaction().commit();
	}

}
