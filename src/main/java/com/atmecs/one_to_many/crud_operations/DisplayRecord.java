package com.atmecs.one_to_many.crud_operations;

import java.util.List;
import java.util.Scanner;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.atmecs.one_to_many.entity.Employee_Details;
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
		    
		    String query="FROM Employee_Details where e_id='"+id+"'"+"";
		    
		    @SuppressWarnings("unchecked")
			List<Employee_Details> list = session.createQuery(query).getResultList();
		    
		    for (Employee_Details emp_det : list)
			{
				System.out.println("Employee Name: " + emp_det.getE_name());
				System.out.println("Manager Mail: "+emp_det.getE_email());
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
