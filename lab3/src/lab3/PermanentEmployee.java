package lab3;

public class PermanentEmployee extends Employee
{
	private String firstName;
	private String lastName;
	private double salary;
	private String grade;
	private static int idCount;
	Date dateOfJoining; 
	public double getSalary()
    {
   	 return salary;
    }
	public PermanentEmployee(String firstName,String lastName,String grade,Date dateOfJoining)
	{
		super(firstName,lastName,grade,dateOfJoining);
		this.idCount=idCount++;
	} 
}
