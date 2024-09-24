package com.pfms.Pfms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pfms.dao.EmployeeDao;
import com.pfms.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        EmployeeDao employeeDao=(EmployeeDao)applicationContext.getBean("employeeDao", EmployeeDao.class);

  
        
        try {
   			// for all data diplay
				List<Employee> list = employeeDao.getAllEmployee();
				for(Employee employee1:list) {
					System.out.println(employee1.getId());
					System.out.println(employee1.getName());
					System.out.println(employee1.getAddress());
					System.out.println(employee1.getNumber());
	
		}
				
				
        }catch (Exception e) {
			System.out.println("enter the Invalid  ID");
			System.out.println(e.getMessage());
		}
        
    
}
}
