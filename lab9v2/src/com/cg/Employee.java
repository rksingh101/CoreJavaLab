package com.cg;

	public class Employee implements Comparable{
		private String firstName;
		private String lastName;
		private double salary;
		private String grade;
		private static int count;
		private int id;
		Date dateOfJoining; 
		
		public Employee(int id)
		{
			this.id = id;
			this.firstName = null;
			this.lastName = null;
			this.salary   = 0;
			this.grade = null;
			this.dateOfJoining = null;
			
		}
		public Employee(String firstName,String lastName,double salary,String grade,Date dateOfJoining)
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.salary   = salary;
			this.grade = grade;
			this.dateOfJoining = dateOfJoining;
			id = ++count;
		}
		public int compareTo(Object o) {
			//System.out.println("Comparing "+ this + " with "+ o);
			int diff = this.id - ((Employee)o).id;
			return diff;
		}
		
		public String toString() {
			return id +" :"+ firstName + " " + lastName + "  Salary:" +salary+ "Grade: "+grade+"Date Of Joining: "+dateOfJoining ;
		}
	}
