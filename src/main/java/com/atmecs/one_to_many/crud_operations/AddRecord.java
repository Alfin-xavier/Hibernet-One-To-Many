package com.atmecs.one_to_many.crud_operations;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.atmecs.one_to_many.entity.Manager_Details;
import com.atmecs.one_to_many.entity.Project_Details;

public class AddRecord {

	public void addRecord() 
	{

		Scanner scan = new Scanner(System.in);
		
		final Session session = com.atmecs.one_to_many.utility.HibernateUtility.getHibernateSession();
		try {
			Transaction transaction = session.beginTransaction();

			System.out.println("Enter the number of records you want to Add :");

			int quantity = scan.nextInt();

			for (int i = 1; i <= quantity; i++) 
			{
				System.out.println("Enter the no.of details :" + i+"\n");

				System.out.println("Enter the Manager Name :");
				String m_name = scan.next();
				System.out.println("Enter the Mail:");
				String m_email = scan.next();

				System.out.println("Enter the Project Name :");
				String p_name = scan.next();
				System.out.println("Enter Duration: ");
				String p_duration = scan.next();

				Manager_Details manager_det = new Manager_Details();
				
				manager_det.setM_name(m_name);
				manager_det.setM_email(m_email);
				manager_det.setProj_det(new Project_Details(p_name,p_duration));
				
				session.save(manager_det);

			}
			transaction.commit();
		} 
		finally 
		{
			session.close();
		}
	}
}
