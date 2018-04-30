package com.cg;

import java.util.HashMap;

public class Services {

	Employee emp;
	HashMap<EmployeePK, Employee> entry = new HashMap<EmployeePK, Employee>();
	
	public void addEntry(EmployeePK empKey, Employee emp)
	{
		
		//System.out.println(empKey);
		//System.out.println(emp);
        
		entry.put(empKey, emp);
		//System.out.println(entry.get(empKey));
		//System.out.println("Added");
        //return entry;	
	}
	
	public HashMap<EmployeePK, Employee> getMap()
	{
		return entry; 
	}
	public Employee search(HashMap<EmployeePK, Employee> map, EmployeePK key)
	{
		//Employee emp = null;
		//System.out.println(key);
		//System.out.println(entry.get(key));
			
		return  entry.get(key);
	}
	
	
}
