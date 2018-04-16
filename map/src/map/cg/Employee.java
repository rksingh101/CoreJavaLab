package map.cg;

public class Employee {
	private String name;
    private Address address;
	public void setAddress(Address address)
    {
    	this.address = address;
    }
	public void setName(String name)
	{
		this.name = name;
	}
	public Address getAddress()
	{
		return address;
	}
	public String getName()
	{
		return name;
	}
}
