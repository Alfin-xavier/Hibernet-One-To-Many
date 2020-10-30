package com.atmecs.one_to_many.entity;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "team_details")
public class Team_Details 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "t_id")
    private int t_id;
	
    @Column(name = "t_name")
    private String t_name;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "t_id")
    private Set<Employee_Details> employee_det;
 
	public int getT_id() 
	{
		return t_id;
	}

	public Set<Employee_Details> getEmployee_det()
	{
		return employee_det;
	}

	public void setEmployee_det(Set<Employee_Details> employee_det) 
	{
		this.employee_det = employee_det;
	}

	public void setT_id(int t_id) 
	{
		this.t_id = t_id;
	}

	public String getT_name() 
	{
		return t_name;
	}

	public void setT_name(String t_name) 
	{
		this.t_name = t_name;
	}

	public Team_Details(String t_name) 
	{
		this.t_name = t_name;
	}

	public Team_Details() 
	{

	}

  
}
