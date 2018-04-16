package lab3;
public class EntryConsole {
	  public static void main(String[] args)
	  {

		  	 Date doj  = new Date(11,12,2013); 
		   	 Employee emp = new PermanentEmployee("Raj","Ghosh",75000,"a5", doj);
		   	 emp.displayentry();
	     	 System.out.println();
		     	 
	         doj  = new Date(9,6,2013);
	    	 emp = new Employee("John","Cena",65000,"a5",doj);	    
	    	 emp.displayentry();
	    	 System.out.println();
		     	 
	         doj  = new Date(8,5,2011);
	    	 emp = new Employee("Simran","Setia",85000,"a3",doj);	    
	    	 emp.displayentry();
	    	 System.out.println();
		     	 
	         doj  = new Date(7,6,2014);
	    	 emp =  new Employee("Dev","Bose",3000,"a2",doj);
	    	 emp.displayentry();
	    	 System.out.println();
		     	 
	 	     doj  = new Date(12,12,2016);
	    	 emp = new Employee("Jimmy","Singh",70000,"b5",doj);
	    	 emp.displayentry();
		 		 
		    emp.displaycount();
		   }
}
