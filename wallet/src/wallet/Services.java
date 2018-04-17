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
		return acc;
	}
	
	public void showBalance(int accountNo)
	{
		Repository repo = new Repository();
		System.out.println();
		//retrieve the account from the repository
		Account acc = repo.findAccount(accountNo);
		//print the account details
		System.out.println("Account id     :"+acc.getAccountNo());
		System.out.println("Customer Name  :"+acc.getCustomer().getCustomerName());
		System.out.println("Account Balance:"+acc.getAccountBalance());	
	}
	
	public Account depositFunds(int accountNo, double amount)
	{
	    Repository repo = new Repository();
		System.out.println();
		//get account from the repository
		Account acc = repo.findAccount(accountNo);
		
		//make changes to the account balance
		acc.setAccountBalance(acc.getAccountBalance()+amount);
		
		//save the changes into the repository
;
		return acc;
	}
	
	public Account FundTransfer(int debitAccountNo,int creditAccountNo,double amount)
	{
	    Repository repo = new Repository();
		System.out.println();
		
		//get accounts from Repository
		Account debitAcc = repo.findAccount(debitAccountNo);
		Account creditAcc = repo.findAccount(creditAccountNo);
		
		//debit and credit amount from balances in accounts
		debitAcc.setAccountBalance(debitAcc.getAccountBalance()-amount);
		creditAcc.setAccountBalance(creditAcc.getAccountBalance()+amount);
		
		//save the changes into the repository
		repo.saveAccount(debitAcc, debitAcc.getAccountNo());
		repo.saveAccount(creditAcc, creditAcc.getAccountNo());
		return creditAcc;
	}
}
