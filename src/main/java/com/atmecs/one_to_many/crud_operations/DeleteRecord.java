package com.atmecs.one_to_many.crud_operations;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityTransaction;
import org.hibernate.Session;

import com.atmecs.one_to_many.entity.Manager_Details;
import com.atmecs.one_to_many.utility.HibernateUtility;

public class DeleteRecord 
{
	public void deleteRecord() throws Exception
	{
		Scanner scan = new Scanner(System.in);
		
		final Session session = HibernateUtility.getHibernateSession();
		
		try 
		{
			EntityTransaction transaction =  session.beginTransaction();	
			
			System.out.println("Enter id to Delete the record :");
			int id = scan.nextInt();
			
			String query = "FROM Manager_Details where m_id='" + id + "'" + "";
			
			@SuppressWarnings("unchecked")
			List<Manager_Details> list = session.createQuery(query).getResultList();
			System.out.println(list);
			
			for (Manager_Details manager_det : list) 
			{
				String name = manager_det.getM_name();
				System.out.println("Manager Name :" + name);
				session.delete(manager_det);
			}
			transaction.commit();
		} 
		
		finally 
		{
			session.close();
		}
	}
}
