package com.atmecs.one_to_many.crud_operations;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.atmecs.one_to_many.entity.Employee_Details;
import com.atmecs.one_to_many.entity.Team_Details;

public class AddRecord 
{
	public void addRecord() 
	{

		Scanner scan = new Scanner(System.in);
		
		final Session session = com.atmecs.one_to_many.utility.HibernateUtility.getHibernateSession();
		try 
		{
			
			  Transaction transaction = session.beginTransaction();
			  
			  Team_Details team_det = new Team_Details("SDET");
			  
			  Employee_Details emp_det1 = new Employee_Details("Alfin","alfin.anthonyraj@atmecs.com.com",team_det); 
			  Employee_Details emp_det2 = new Employee_Details("Padma","padma.inba@gmail.com",team_det);
			  Employee_Details emp_det3 = new Employee_Details("Vasu","vasu.vanu@gmail.com",team_det);
			  
			  Set<Employee_Details> employee_det = new HashSet<Employee_Details>();
			  employee_det.add(emp_det1); 
			  employee_det.add(emp_det2);
			  employee_det.add(emp_det3);
			  
			  team_det.setEmployee_det(employee_det);
			 
			
			session.save(team_det);
			
			transaction.commit();
		}
		finally 
		{
			session.close();
		}
	}
}
