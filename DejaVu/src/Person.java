
public class Person {

	String userName;
	int age;
	public Person(String userName, int age)
	{
		this.userName = userName;
		this.age= age;
	}
	public boolean equals(Object obj)
	{
		if(obj instanceof Person)
		{//return false;
		if(this.userName.equals(((Person)obj).userName))
			return true;
		}
			return false;
	}
	
	}

