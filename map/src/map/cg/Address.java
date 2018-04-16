package map.cg;

public class Address {
	private String line;
    private Country country;
	public void setAddressLine(String line)
    {
    	this.line = line;
    }
	public void setCountry(Country country)
	{
		this.country = country;
	}
	public String getAddressLine()
	{
		return line;
	}
	public Country getCountry()
	{
		return country;
	}
}
