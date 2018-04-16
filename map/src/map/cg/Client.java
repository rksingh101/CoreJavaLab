package map.cg;
public class Client {
	public static void main (String[] args)
   {
	   int count = 0;
	   Employee[] employees = new Employee[5];
	   
	   //Employee no 1;
	   City ci = new City();
	   ci.setCityName("Pune");
	   Country co = new Country();
	   co.setCountryName("India");
	   co.setCity(ci);
	   Address ad = new Address();
	   ad.setAddressLine("10 Balwade High Street");
	   ad.setCountry(co);
	   employees[count] = new Employee();
	   employees[count].setName("Raj");
	   employees[count].setAddress(ad); 
	   count++;
	   //Employee no 2;
	   ci = new City();
	   ci.setCityName("Seattle");
	   co = new Country();
	   co.setCountryName("Australia");
	   co.setCity(ci);
	   ad = new Address();
	   ad.setAddressLine("15 Causeway Road");
	   ad.setCountry(co);
	   employees[count] = new Employee();
	   employees[count].setName("Shawne");
	   employees[count].setAddress(ad);
	   count++;
	   
	 //Employee no 3;
	   ci = new City();
	   ci.setCityName("Tokyo");
	   co = new Country();
	   co.setCountryName("Japan");
	   co.setCity(ci);
	   ad = new Address();
	   ad.setAddressLine("Akhihabara Link");
	   ad.setCountry(co);
	   employees[count] = new Employee();
	   employees[count].setName("Tamashiro");
	   employees[count].setAddress(ad);
	   count++;
	   
	 //Employee no 4;
	   ci = new City();
	   ci.setCityName("New York");
	   co = new Country();
	   co.setCountryName("USA");
	   co.setCity(ci);
	   ad = new Address();
	   ad.setAddressLine("15 Manhattan Street");
	   ad.setCountry(co);
	   employees[count] = new Employee();
	   employees[count].setName("Tim");
	   employees[count].setAddress(ad);
	   count++;
	   
	 //Employee no 5;
	   ci = new City();
	   ci.setCityName("Paris");
	   co = new Country();
	   co.setCountryName("France");
	   co.setCity(ci);
	   ad = new Address();
	   ad.setAddressLine("Le Pausteri Road");
	   ad.setCountry(co);
	   employees[count] = new Employee();
	   employees[count].setName("Chanelle");
	   employees[count].setAddress(ad);
	   
	   System.out.println();
		for(count=0; count<employees.length; count++)
		{
			System.out.println("Employee no: "+(count+1));
			System.out.println("Name: "+employees[count].getName());
			System.out.println("Address Line: "+employees[count].getAddress().getAddressLine());
			System.out.println("City: "+employees[count].getAddress().getCountry().getCity().getCityName());
			System.out.println("Country: "+employees[count].getAddress().getCountry().getCountryName());
			System.out.println();
		}
   }
}
