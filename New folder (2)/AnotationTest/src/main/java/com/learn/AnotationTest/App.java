package com.learn.AnotationTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
try {
	
    System.out.println( "Hello World!" );
    
    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
    Employee bean = applicationContext.getBean("emp", Employee.class);
    
    System.out.println(bean.getId());
    System.out.println(bean.getName());
    System.out.println(bean.getAddress());
    
    
    Employee beans = applicationContext.getBean("emp", Employee.class);
    System.out.println(beans);
    
	
} catch (Exception e) {
	// TODO: handle exceptione
	e.printStackTrace();
}
        
    }
}
