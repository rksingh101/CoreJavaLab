package lab3;

public class PermanentEmployee extends Employee
{
	private double salary;
	private static int idCount;
	Date dateOfJoining; 
	public double getSalary()
    {
   	 return salary;
    }
	
	public PermanentEmployee(String firstName,String lastName,double salary,String grade,Date dateOfJoining)
	{
		super(firstName,lastName,salary,grade,dateOfJoining);
		this.idCount=idCount++;
	} 
	public void displaycount()
	{
		   System.out.println("Total Permanent employees entered : "+idCount);	
		
	}
}
