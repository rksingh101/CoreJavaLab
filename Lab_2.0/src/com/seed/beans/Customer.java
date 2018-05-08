package com.seed.beans;

public class Customer {
	private long mobile;
	private int pincode;
	private String name;
	private Object authorName;
	private Object publication;
	
//	TODO:1	Provide no-argument public constructor
	public Customer()
	{
		this.authorName = null;
		this.publication = null;
		this.name = null;
		this.mobile = 0;
		this.pincode = 0;
	}
//	TODO:2	Provide getters and setters for all attributes.
	public void setAuthorName(Object authorName)
	{
		this.authorName = authorName;
	}
	public void setPublication(Object publication)
	{
		this.publication = publication;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPincode(int pincode)
	{
		this.pincode = pincode;
	}
	public void setMobile(long mobile)
	{
		this.mobile = mobile;
	}
	public Object getAuthorName()
	{
		return authorName;
	}
	public Object getPublication() 
	{
		return publication;
	}
	public String getName(String name)
	{
		return name;
	}
	public int getPincode(int pincode)
	{
		return pincode;
	}
	public long getMobile(long mobile)
	{
		return mobile;
	}
	
}
