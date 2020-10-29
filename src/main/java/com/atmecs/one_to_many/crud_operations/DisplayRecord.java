package com.atmecs.one_to_many.crud_operations;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.atmecs.one_to_many.entity.Manager_Details;
import com.atmecs.one_to_many.utility.HibernateUtility;

public class DisplayRecord
{
	public  void displayRecord() 
	{
		Scanner scan=new Scanner(System.in);
	
		final Session session = HibernateUtility.getHibernateSession();
	
		try 
		{
		    Transaction transaction=session.beginTransaction();
		    
		    System.out.println("Enter the id to see the Details :");
		    int id=scan.nextInt();
		    
		    String query="FROM Manager_Details where m_id='"+id+"'"+"";
		    
		    @SuppressWarnings("unchecked")
			List<Manager_Details> list = session.createQuery(query).getResultList();
		    
		    for (Manager_Details manager_det : list)
			{
				System.out.println("Manager Name: " + manager_det.getM_name());
				System.out.println("Manager Mail: "+manager_det.getM_email());
			}
		    
			//System.out.println(list);
			
			transaction.commit();
		}
	
		finally 
		{

			session.close();
		}
	}
}
