package com.atmecs.one_to_many.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "emp_details")
public class Employee_Details 
{
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "e_id")
	    private int e_id;
	 
	    @Column(name = "e_name")
	    private String e_name;
	 
	    @Column(name = "e_email")
	    private String e_email;
	 
	    @ManyToOne
	    @JoinColumn(name = "m_id")
	    private Manager_Details manager_det;
	    
	    public Employee_Details()
	    {
	    	
	    }
	    
		public Employee_Details(String e_name, String e_email) 
		{
			this.e_name = e_name;
			this.e_email = e_email;
		}
		
		public int getE_id() 
		{
			return e_id;
		}
		
		public void setEmp_id(int e_id) 
		{
			this.e_id = e_id;
		}

		public String getE_name() 
		{
			return e_name;
		}

		public void setEmp_name(String e_name) 
		{
			this.e_name = e_name;
		}

		public String getE_email()
		{
			return e_email;
		}

		public void setE_mail(String e_email) 
		{
			this.e_email = e_email;
		}

}
