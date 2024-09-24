package com.dao;

import org.hibernate.Session;

import com.entity.Employee;
import com.session.SessionProvider;

public class EmployeeDao {

	// we can use jsp also getSession Method calling here or Also Dao
	
	public void saveEmp(Employee emp)
	{
		//calling here class name
		  Session session =  SessionProvider.getSession();
		  
		  System.out.println(session);
		
	}
	
	
}
