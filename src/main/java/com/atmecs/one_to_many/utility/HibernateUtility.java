package com.atmecs.one_to_many.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility 
{
	public static Session getHibernateSession()
	{
		final SessionFactory factory = new Configuration().addAnnotatedClass(com.atmecs.one_to_many.entity.Manager_Details.class)
				.addAnnotatedClass(com.atmecs.one_to_many.entity.Project_Details.class)
		        .configure("hibernate.cfg.xml").buildSessionFactory();
		
		final Session session = factory.openSession();
		
	    return session;
	}
}
