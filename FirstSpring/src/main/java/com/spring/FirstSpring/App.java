package com.spring.FirstSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        try {
        	
        	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/FirstSpring/applicationcontext.xml");
        	BulbService bean = (BulbService)applicationContext.getBean("bservice");
        	System.out.println(bean.askBulb());
        	
        	
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
    }
}
