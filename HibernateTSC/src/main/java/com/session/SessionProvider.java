package com.session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public final class SessionProvider
{
    public static Session session=null;
    private  SessionProvider()
    {
    }

public synchronized static Session getSession()
{
    try
    {
        if(session==null) {
            Configuration configuration = new Configuration();
            configuration.configure();
            SessionFactory sessionFactory =configuration.buildSessionFactory();
            session=sessionFactory.openSession();
        }
        else
        {
            return  session;
        }
    }
    catch (Exception exception)
    {
        exception.printStackTrace();
    }
    return session;
}

}
	
	

