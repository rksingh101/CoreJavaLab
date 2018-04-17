package lab3;

public class ContractEmployee extends Employee
{
    	     private int noOfHours;
             private static int count;
             private Contractor contractor;
             public ContractEmployee(String firstName,String lastName,int noOfHours, String grade,Date dateOfJoining)
         	{
            	
         		super(firstName,lastName,450*noOfHours,grade,dateOfJoining);
         		 ContractEmployee.count=count++;
         		this.noOfHours = noOfHours;
         	} 
             public double getSalary()
             {
            	 
            	 return contractor.getRate()*noOfHours;
             }
             public void displaycount()
         	{
         		   System.out.println("Total Contract Employees entered : "+count);	
         		
         	}
             public Contractor getContractor()
             {
            	 return contractor;
             }
}
