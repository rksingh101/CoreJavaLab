package com.cg;

public class Employee
{
	int id;
	String name;
	String entity;
	String department;

	public Employee()
	{
		this.id = 0;
		this.name = null;
		this.entity = null;
		this.department = null;
	}
	
	public int getId()
	{
		return id;
	}
	public String getEntity()
	{
		return entity;
	}
	public Employee(int id, String name, String entity, String department)
	{
		this.id = id;
		this.name = name;
		this.entity = entity;
		this.department = department;
	}
	public String toString()
	{
		return id+" "+name+" "+entity+" department is "+department;
	}
}
