package com.learn.SpringAutowire;

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
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car bean = (Car) context.getBean("car");
        System.out.println("there are price"+bean.getPrice());
        System.out.println("there are Cycle"+bean.getCcycle());
        
    }
}
