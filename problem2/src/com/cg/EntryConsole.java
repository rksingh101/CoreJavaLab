package com.cg;

import java.util.HashMap;

public class EntryConsole {

	public static void main(String []args)
	{
		Services services = new Services();
		
		Employee employee  = new Employee(1, "RK", "FS", "DevOps");
		EmployeePK employeeKey = new EmployeePK(employee.getId(),employee.getEntity());
		services.addEntry(employeeKey, employee);

		employee  = new Employee(2, "Indranil", "FS", "DevOps");
		employeeKey = new EmployeePK(employee.getId(),employee.getEntity());
		services.addEntry(employeeKey, employee);

		employee  = new Employee(3, "Teena", "NonFS", "Development");
		employeeKey = new EmployeePK(employee.getId(),employee.getEntity());
		services.addEntry(employeeKey, employee);

		employee  = new Employee(4, "Sai", "NonFS", "Development");
		employeeKey = new EmployeePK(employee.getId(),employee.getEntity());
		services.addEntry(employeeKey, employee);

		employee  = new Employee(5, "Cox", "FS", "Maintainance");
		employeeKey = new EmployeePK(employee.getId(),employee.getEntity());
		services.addEntry(employeeKey, employee);


		employeeKey = new EmployeePK(2, "FS");
		HashMap<EmployeePK, Employee> map = services.getMap();
		employee = services.search(map, employeeKey);
        
		if(employee != null)
			System.out.println(employee);
		else
			System.out.println("Key Not Found");
	}
}
