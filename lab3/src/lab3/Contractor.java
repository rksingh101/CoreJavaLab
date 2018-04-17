package lab3;

public class Contractor {
        private String name;
        private double rate = 500;
        private static int count;
        private ContractEmployee[] contractEmployee;
        public Contractor(String name, double rate, ContractEmployee contractEmployee)
        {
        	this.name = name;
        	this.rate = rate;
        	this.contractEmployee[count] = contractEmployee;
        	count++;
        }
        public String toString()
        {
        	return "ContractorName: "+name;
        }
        public double getRate()
        {
        	return rate; 
        }
}
