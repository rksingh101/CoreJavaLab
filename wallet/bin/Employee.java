package emsv1;

public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	private String grade;
	private static int count;
	private int id;
	Date dateOfJoining; 
	
	/*public empdir()
	{
		fname = "N/A";
		lname = "N/A";
		sal   = 0.0;
		grade = "N/A";
	}*/
	
	/*public Employee(String firstName,String lastName,double salary,String grade,Date dateOfJoining)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary   = salary;
		this.grade = grade;
		this.dateOfJoining = dateOfJoining;
		this.idCount = ++idCount;
	}*/
	public void setEmployee(String firstName,String lastName,double salary,String grade,Date dateOfJoining)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary   = salary;
		this.grade = grade;
		this.dateOfJoining = dateOfJoining;
		id = ++count;
		//System.out.println("ID:"+id+" Counter:"+idCount);
	}
	public int getEmpID()
	{
		return id;
	}
	public void displayentry()
	{
		
		   System.out.println("Employee ID   : "+id);			
           System.out.println("First Name    : "+firstName);
           System.out.println("Last  Name    : "+lastName);
           System.out.println("Salary        : "+salary);
           System.out.println("Grade         : "+grade);
           System.out.println("Date          : "+dateOfJoining);
   }
	
}