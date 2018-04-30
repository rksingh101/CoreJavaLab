package com.cg;
import java.util.TreeSet;
import java.util.Collection;
import custom.EmployeeNotFoundException;

public class Repository 
{
    TreeSet tree = new TreeSet();            
	
    public void addEmployee(Employee emp)
    {
        tree.add(emp);
        System.out.println("Added");
    }
    public void findEmployee(int reqID)
    {
    	Object ob = new Employee(reqID);
    	        	 try
        	    	 {
    	        		if(tree.contains(ob)) 
    	        		System.out.println("Employee details were Found");
    	        		else
    	        		throw new EmployeeNotFoundException("Employee was Not Found");
        	    	 }
    	        	 catch(EmployeeNotFoundException excep)
        	    		 {
        	    			 excep.getMessage();
        	    			 excep.printStackTrace();
        	    		 }

    }
}
