package com.orm;

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
        
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationxontext.xml");
        Employee bean = (Employee)applicationContext.getBean("employee");
        System.out.println(bean);
    }
}
