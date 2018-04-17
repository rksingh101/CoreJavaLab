package lab3;
public class EntryConsole {
	  public static void main(String[] args)
	  {

		  	 Date doj  = new Date(11,12,2013); 
		   	 Employee emp = new PermanentEmployee("Raj","Ghosh",75000,"a5", doj);
		   	 emp.displayentry();
	     	 System.out.println();
		     	 
	         doj  = new Date(9,6,2013);
	    	 emp = new PermanentEmployee("John","Cena",65000,"a5",doj);	    
	    	 emp.displayentry();
	    	 System.out.println();
		     	 
	    	 doj  = new Date(8,5,2011);
	    	 emp = new ContractEmployee("Simran","Setia",45,"a3",doj);
	    	// System.out.println((ContractEmployee)emp);
	    	 Contractor con = new Contractor("Naukri.com",450,(ContractEmployee)emp);
	    	 System.out.println(con);
	    	 emp.displayentry();
	    	 System.out.println();
		     	 
	         doj  = new Date(7,6,2014);
	    	 emp =  new ContractEmployee("Dev","Bose",45,"a2",doj);
	    	 con = new Contractor("Glassdoor.com",450,(ContractEmployee)emp);
	    	 System.out.println(con);
	    	 emp.displayentry();
	    	 System.out.println();
		     	 
	 	     doj  = new Date(12,12,2016);
	    	 emp = new ContractEmployee("Jimmy","Singh",25,"b5",doj);
	    	 con = new Contractor("Naukri.com",450,(ContractEmployee)emp);
	    	 System.out.println(con);
	    	 emp.displayentry();
	    	 emp.displaycount();
	    	 
	    	
		    emp.displaycount();
		   }
}
