package wallet;

public class Services {
    public static int id;
	public Account createAccount(String name, double amount)
	{
		id++;
		Account acc = new Account();
		acc.setAccountNo(id);
		Customer cus = new Customer();
		cus.setCustomerName(name);
		acc.setCustomer(cus);
		acc.setAccountBalance(amount);
		Repository repo = new Repository();
		acc = repo.saveAccount(acc);
		//System.out.println("In services"+acc);
		return acc;
	}
	
}
