package lab3;

public class ContractEmployee extends Employee
{
    private int noOfHours;
             private static int count;
             private Contractor contractor;
             public double getSalary(int hours)
             {
            	 return noOfHours*contractor.getRate();
             }
             public Contractor getContractor()
             {
            	 return contractor;
             }
                   public ContractEmployee(String firstName,String lastName,String grade,Date dateOfJoining)
         	{
         		super(firstName,lastName,ContractEmployee.getSalary(),grade,dateOfJoining);
         		this.count=count++;
         	} 
}
