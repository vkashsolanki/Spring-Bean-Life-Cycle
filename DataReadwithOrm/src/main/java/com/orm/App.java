package com.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.orm.dao.StudentDao;
import com.orm.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.out.println("hi....");
        
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        StudentDao bean = applicationContext.getBean("studentDao", StudentDao.class);
    
		  //insert
		  Student student = new Student(11,"Vinod","pune"); bean.insert(student);
		 
    //get method
        student = bean.getStudent(12);
        System.out.println(student);
        
        //update
         student= new Student(11,"delhi","vikash");
        bean.updata(student);
        student =bean.getStudent(11);
        System.out.println(student);
        
    
    }
}
