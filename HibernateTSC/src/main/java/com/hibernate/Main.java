package com.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.entity.Employee;
import com.entity.Person;
import com.entity.Student;
import com.session.SessionProvider;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
       
   Session session = SessionProvider.getSession();
   
     Transaction transaction = session.beginTransaction();
     
     
   
   Person person = new Person();
    person.setName("Ram");
    
    Employee employee = new Employee();
    employee.setJob("Software Developer");
    employee.setSalary(45120);
        
    Student student = new Student();
    student.setCourse("Java");
    student.setFees(20000);
    
    session.save(person);
    session.save(student);
    session.save(employee);
    
    transaction.commit();
    session.close();
        
        
    }
}
