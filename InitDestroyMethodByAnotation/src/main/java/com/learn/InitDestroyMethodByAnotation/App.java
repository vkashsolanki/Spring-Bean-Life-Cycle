package com.learn.InitDestroyMethodByAnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
    	//context.registerShutdownHook();
    	context.getBean("employeeobj");
    	
    	
    	
    	
    	
    	
    }
}
