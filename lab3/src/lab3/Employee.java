package lab3;

public class Employee 
{
	private String firstName;
	private String lastName;
	private double salary;
	private String grade;
	private static int idCount;
	Date dateOfJoining; 
	
	public Employee(String firstName,String lastName,String grade,Date dateOfJoining)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		//this.salary   = ;
		this.grade = grade;
		this.dateOfJoining = dateOfJoining;
		this.idCount = ++idCount;
	}
	public void displayentry()
	{
		   System.out.println("Employee ID   : "+idCount);			
           System.out.println("First Name    : "+firstName);
           System.out.println("Last  Name    : "+lastName);
           System.out.println("Salary        : "+getSalary());
           System.out.println("Grade         : "+grade);
           System.out.println("Date          : "+dateOfJoining);
   }
   public double getSalary()
   {
	   return salary;
   }
	public void displaycount()
	{
		   System.out.println("Total entries present : "+idCount);	
		
	}
}

