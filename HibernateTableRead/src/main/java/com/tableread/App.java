package com.tableread;


import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;
import com.entity.User;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

public class App 
{

    public static void main(String[] args) {
    try
    {
       
            Configuration configuration = new Configuration();
            configuration.configure();
            SessionFactory sessionFactory =configuration.buildSessionFactory();
            Session session=sessionFactory.openSession();
            //Query query =session.createQuery("from Employee");
            Query query =session.createQuery("from User");

            //List<Employee>  empList=query.getResultList();
            List<User>  empList=query.getResultList();
        
            for (User user : empList) {
			
            	System.out.println(user.getId());
            	System.out.println(user.getName());
            	System.out.println(user.getAddress());
            	System.out.println(user.getNumber());
			}

    }
    catch (Exception exception)
    {
        exception.printStackTrace();
    }
  
}


}















































/*
 * public final class App
 * 
 * {
 * 
 * 
 * 
 * public static Session session;
 * 
 * private App() {
 * 
 * }
 * 
 * public synchronized static Session getSession() { try {
 * 
 * if(session==null) { Configuration configuration = new Configuration();
 * configuration.configure();
 * 
 * SessionFactory factory = configuration.buildSessionFactory(); session =
 * factory.openSession(); }
 * 
 * else { return session; }
 * 
 * } catch (Exception e) { e.printStackTrace(); }
 * 
 * 
 * return session; }
 * 
 * public static void main( String[] args ) { System.out.println( "Hello World!"
 * );
 * 
 * 
 * Session session = App.getSession();
 * 
 * Query query =
 * session.createQuery("select id,name,address,number from employee");
 * 
 * List list = query.getResultList(); Iterator iterator = list.iterator();
 * 
 * while (iterator.hasNext()) { //System.out.println(iterator.next()); Object
 * employee[] = (Object[]) iterator.next(); System.out.println(employee[0]);
 * System.out.println(employee[1]); System.out.println(employee[2]);
 * System.out.println(employee[3]);
 * 
 * } }
 * 
 * 
 * }
 * 
 */