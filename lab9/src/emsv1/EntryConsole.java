package emsv1;

import custom.EmployeeNotFoundException;

public class EntryConsole 
{
	    public static void main(String[] args) throws EmployeeNotFoundException
		{

	    	 Repository repo = new Repository();
	    	 Employee emp = new Employee();
	    	 Date doj  = new Date(11,12,2013);
	    	 emp.setEmployee("Raj","Ghosh",75000,"a5", doj); 
	    	 repo.addEmployee(emp);
	    	 System.out.println();
	     	 
	         doj  = new Date(9,6,2013);	   
	         emp = new Employee();
	    	 emp.setEmployee("John","Cena",65000,"a5",doj);
	    	 repo.addEmployee(emp);
	    	 System.out.println();
	     	 
	         doj  = new Date(8,5,2011);
	         emp = new Employee();
	         emp.setEmployee("Simran","Setia",85000,"a3",doj);	    
	    	 System.out.println();
	    	 repo.addEmployee(emp);
	    	 
	     	 doj  = new Date(7,6,2014);
	     	 emp = new Employee();
	     	 emp.setEmployee("Dev","Bose",3000,"a2",doj);
	    	 repo.addEmployee(emp);
	    	 System.out.println();
	     	 
	 	     doj  = new Date(12,12,2016);
	 	     emp = new Employee();
	 	     emp.setEmployee("Jimmy","Singh",70000,"b5",doj);
	    	 repo.addEmployee(emp);
	    	 
	    	 //id to be found
	    	 int reqID = 10;

    		
	         repo.findEmployee(reqID);
	        // emp.displayentry();
		}
}
	  
