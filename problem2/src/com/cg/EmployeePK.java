package com.cg;

public class EmployeePK
{
		int id;
		String entity;
		
		public EmployeePK()
		{
			this.id = 0;
			this.entity = null;
		}
		public EmployeePK(int id, String entity)
		{
			this.id = id;
			this.entity = entity;
		}
		public String toString()
		{
			return id+" "+entity;
		}
		
		public int hashCode(){
			return entity.hashCode();
		}
		public boolean equals(Object obj )
		{
	    	boolean flag;
	    	flag = ((this.id == ((EmployeePK)obj).id) && (this.entity.equals(((EmployeePK)obj).entity)));
			
			return flag;	    
		}
}
