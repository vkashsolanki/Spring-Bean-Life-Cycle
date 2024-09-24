package com.hibernet.tools.HibernetProgram;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
    	Student st= new Student();
    	
    	st.setId(101);
    	st.setName("vikash solanki");
    	st.setMarks("200");
    	
    	Configuration configuration = new  Configuration().configure().addAnnotatedClass(Student.class);
    	ServiceRegistry registry = new ServiceRegsiteryBuilder()
    	SessionFactory factory = configuration.buildSessionFactory();
    	Session  session = factory.openSession();
    	
    	session.save(st);
        
    }
}
