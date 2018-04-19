package emsv1;

import custom.EmployeeNotFoundException;

public class Repository 
{
                 private Employee[] employees = new Employee[5];
                 private int pos;
                 public void addEmployee(Employee emp){
                	 employees[pos] = emp;
                	 //testing input
                	 //System.out.println(employees[pos]);
	    			 //System.out.println();
                	 pos++;               
                 }
                 
                 public void findEmployee(int reqID)
                 {
                	 int i = 0, flag = 0;
                	 try
        	    	 {
        	    		 for(i=0;i<employees.length;i++)
        	    		 {
                             if(employees[i].getEmpID() == reqID)
        	    				 {
        	    				 //System.out.println(true);
        	    				 employees[i].displayentry();
        	    				 return;
        		    			/* flag = 1;
        	    				 break;*/
        	    				 }
        	    		 }
//        	    		 if (flag==0)
//        	    		 { 
        	    			//System.out.println(false);
        	    		 	throw new EmployeeNotFoundException("Employee was Not Found");
//        	    		 }
        	    	 }
        	         catch(EmployeeNotFoundException excep)
        	    		 {
        	    			 excep.getMessage();
        	    			 excep.printStackTrace();
        	    		 }
        	     }

}
