package lab3;

public class Contractor {
        private String name;
        private double rate = 500;
        private static int count;
        private ContractEmployee[] ContractEmployee = new ContractEmployee[10];
        
        public Contractor(String name, double rate, ContractEmployee ContractEmployee)
        {
        	this.name = name;
        	this.rate = rate;
        	//System.out.println(ContractEmployee);
        	this.ContractEmployee[count] = ContractEmployee;
        	count++;
        }
        public String toString()
        {
        	return "Contractor Name: "+name+" Rate :"+rate;
        }
        public String getName()
        {
        	return name;
        }
        public double getRate()
        {
        	return rate; 
        }
}
