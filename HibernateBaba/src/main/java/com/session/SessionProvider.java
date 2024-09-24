package com.session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;
import com.fasterxml.classmate.AnnotationConfiguration;

public class SessionProvider {
	
	public static Session session = null;
	
	private SessionProvider() {
		// creating singleton use private keyword
	}
	
	public static Session getSession()
	
	{
	
		try {
			
			if(session==null) {
				
			
			
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			// when run sessionFactory our table created in database automatic generate
			SessionFactory factory = configuration.buildSessionFactory();
			System.out.println(factory);
			/*
			 * session = factory.openSession(); Session session =
			 * SessionProvider.getSession();
			 */
			 
			
			
			}
	else
		{
			return session;
			
		}
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return session;
	}
	
		
	}
		
	
	




