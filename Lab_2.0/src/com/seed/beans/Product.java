package com.seed.beans;

//TODO:0	Modification required
abstract public class Product {
	private int id;
	private String name;
	private double price;
	
//	TODO:1	Provide no-argument public constructor
	public Product()
	{
		this.id = 0;
		this.name = null;
		this.price = 0.0;
	}
//	TODO:2	Provide getters and setters for all attributes.
	public void setId(int id)
	{
		this.id = id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
}
