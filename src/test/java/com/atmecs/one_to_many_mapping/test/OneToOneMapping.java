package com.atmecs.one_to_many_mapping.test;

import org.testng.annotations.Test;

import com.atmecs.one_to_many.crud_operations.CrudMenu;

public class OneToOneMapping 
{
	@Test
	public void employee_details() throws Exception
	{
		CrudMenu menu = new CrudMenu();
		
		menu.operations();
	}
}
