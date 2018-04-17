package wallet;

public class Repository {

	private static Account[] accounts = new Account[20];
	private static int idcount;
	public Account saveAccount(Account account)
	{
		accounts[idcount] = account;
		//System.out.println(idcount+" "+accounts[idcount]);
		idcount++;
		return accounts[idcount];
	}
	public boolean saveAccount(Account account, int id)
	{
		for(int i=0;i<accounts.length;i++)
		{
			if(accounts[i].getAccountNo() ==  id)
				{
				accounts[idcount] = account;
				break;
				} 
		}	
		return true;
	}
	public Account findAccount(int accountNo)
	{
		Account acc = new Account();
		for(int i=0;i<accounts.length;i++)
			
		{
			//System.out.println("in loop: "+accounts[i]+" Outside loop: "+accounts[i].getAccountNo());
			if(accounts[i].getAccountNo() == accountNo)
				{
				acc = accounts[i];
				break;
				} 
		}	
		return acc;
		//System.out.println("Account id: "+accounts[accountNo].getAccountNo());
		//System.out.println("Customer Name:"+accounts[accountNo].getCustomer().getCustomerName());
		//System.out.println("Account Balance:"+accounts[accountNo].getaccountBalance());	
		//System.out.println(accounts[accountNo]);
	}
}
