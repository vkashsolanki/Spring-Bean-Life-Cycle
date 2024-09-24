package com.controller.connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryProvider {

public  static SessionFactory factory;

public static SessionFactory getFactory()
{
	if (factory==null)
	{
		factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		
	}
	return factory;
}
public void closeFactory()
{
if(factory.isOpen())
{
	factory.close();	
}
}

public static void main(String[] args) {
	
	System.out.println(getFactory());
	
}

}

