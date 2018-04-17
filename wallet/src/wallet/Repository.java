package wallet;

public class Repository {

	private static Account[] accounts = new Account[20];
	private static int idcount;
	public Account saveAccount(Account account)
	{
		idcount++;
		accounts[idcount] = account;
		//System.out.println("Count: "+idcount);
		return accounts[idcount];
	}
	public void findAccount(int accountNo)
	{
		System.out.println("Account id:"+accounts[accountNo].getAccountNo());
		System.out.println("Customer Name:"+accounts[accountNo].getCustomer().getCustomerName());
		System.out.println("Account Balance:"+accounts[accountNo].getaccountBalance());	
		//System.out.println(accounts[accountNo]);
	}
}
