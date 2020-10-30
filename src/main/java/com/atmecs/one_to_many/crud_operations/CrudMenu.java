package com.atmecs.one_to_many.crud_operations;

import java.util.Scanner;

public class CrudMenu 
{
	public void operations() throws Exception
	{
		int option;
		String choose;
		Scanner scr = new Scanner(System.in);
		
		do
		{
			System.out.println("** One To Many Mapping **\n");
			System.out.println("1.Add Record   2.Display Record  3.Update Record  4.Delete Record\n");
			System.out.println("Select an option :");
			option = scr.nextInt();
		
		switch(option)
			{
				case 1:
					AddRecord add = new AddRecord();
					add.addRecord();;
					break;
				
				case 2:
					DisplayRecord display = new DisplayRecord();
					display.displayRecord();
					break;
					
				case 3:
					UpdateRecord update = new UpdateRecord();
					update.updateRecord();
					break;
					
				case 4:
					DeleteRecord delete = new DeleteRecord();
					delete.deleteRecord();
					break;
					
				default:
					System.out.println("Invalid Selection\n");
			}
				System.out.println("Do you want to continue? Yes or No\n");
				choose = scr.next();
		}
		while(choose.equals("yes"));
	}
}
