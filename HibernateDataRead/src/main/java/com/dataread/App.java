package com.dataread;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Bros");
        
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        
       // Employee employee = (Employee)session.get(Employee.class, 105);
        Employee employee = (Employee)session.load(Employee.class, 103);
		
        
        
		
		  System.out.println(employee.getId()); 
		  System.out.println(employee.getName());
		  System.out.println(employee.getAddress());
		  System.out.println(employee.getNumber());
		
        
        session.close();
        factory.close();
        
        
        
    }
}
