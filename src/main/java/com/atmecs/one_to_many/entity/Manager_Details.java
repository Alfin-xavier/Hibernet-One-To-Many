package com.atmecs.one_to_many.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "manager_details")
public class Manager_Details 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "m_id")
    private int m_id;
	
    @Column(name = "m_name")
    private String m_name;
 
    @Column(name = "m_email")
    private String m_email;
    
    @OneToMany(mappedBy = "manager_details",cascade = CascadeType.ALL)
    private Set<Employee_Details> employee_det;
 
	public int getM_id() 
	{
		return m_id;
	}

	public void setM_id(int m_id) 
	{
		this.m_id = m_id;
	}

	public String getM_name() 
	{
		return m_name;
	}

	public void setM_name(String m_name) 
	{
		this.m_name = m_name;
	}

	public String getM_email() 
	{
		return m_email;
	}

	public void setM_email(String m_email)
	{
		this.m_email = m_email;
	}

	public Manager_Details(String m_name, String m_email) 
	{
		this.m_name = m_name;
		this.m_email = m_email;
	}

	public Manager_Details() 
	{

	}

  
}
