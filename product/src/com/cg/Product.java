package com.cg;

public class Product implements Comparable {
	private int id;
	private String name;
	private double price;
	public Product()
	{
		this.id  = 0;
		this.name = null;
		this.price = 0;
	}
	public Product(int id, String name, Double price)
	{
		this.id  = id;
		this.name = name;
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
	
	public boolean equals(Object obj) {
		boolean flag;
		
		if(!(obj instanceof Product))
			return false;
		flag = (this.id == ((Product)obj).id);
		return flag;
	}
	
	public int compareTo(Object o) {
		int diff = this.id - ((Product)o).id;
		return diff;
	}
	
	public String toString() {
		return id + " " + name +" "+ " Rs."+price;
	}
}
