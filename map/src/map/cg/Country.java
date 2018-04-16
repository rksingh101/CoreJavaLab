package map.cg;

public class Country {
	private String countryName;
	private City city;
    public String getCountryName()
    {
    	return countryName;
    }
    public City getCity()
    {
    	return city;
    }
    public void setCountryName(String countryName)
    {
    	this.countryName = countryName;
    }
    public void setCity(City city)
    {
    	this.city = city;
    }
}
