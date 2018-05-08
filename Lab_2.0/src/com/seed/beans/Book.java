package com.seed.beans;

//TODO:0	Modification required
public class Book extends Product{
	private String authorName;
	private String publication;
	
//	TODO:1	Provide no-argument public constructor
	public Book()
	{
		this.authorName = null;
		this.publication = null;
	}
//	TODO:2	Provide getters and setters for all attributes.
	public void setAuthorName(String authorName)
	{
		this.authorName = authorName;
	}
	public void setPublication(String publication)
	{
		this.publication = publication;
	}
	public String getAuthorName()
	{
		return authorName;
	}
	public String getPublication(String publication) 
	{
		return publication;
			}
}
