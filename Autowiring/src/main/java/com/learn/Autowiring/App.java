package com.learn.Autowiring;

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
        

        
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
       Cricket bean =(Cricket) applicationContext.getBean("cricket");
       System.out.println(bean.getPlayer()+""+bean.getBatsman());
    
    }
}
