package com.learn.InitDestroyMethodByjava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    
    	AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
    	context.registerShutdownHook();
    	//Employee bean = context.getBean("employeeobj", Employee.class);
    	//System.out.println(bean.getId()+" "+ bean.getName());
    	
    	
    	
    	
    	
    }
}
