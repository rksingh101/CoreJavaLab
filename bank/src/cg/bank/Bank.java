package cg.bank;

public class Bank {
	private Account[] accounts = new Account[5];
	
	public void addAccount()
	{
		for(int i=0;i<5;i++)
		{
		    accounts[i] = new Account();
			accounts[i].setAccountNo(i+1);
			accounts[i].setAccountBalance(20000);
		}
		//for(int i=0;i<5;i++)
		//{
		//	System.out.println("Account No: "+accounts[i].getAccountNo());
		//	System.out.println("Account Balance: "+accounts[i].getAccountBalance());
		//}
		
	}
	public void transferAmount(Account toAccount,Account fromAccount,double amount)
	{
        findAccount(toAccount.getAccountNo()).deposit(amount);
		findAccount(fromAccount.getAccountNo()).withdraw(amount);
    }
	public void showTotalBalance(Account toAccount,Account fromAccount)
	{
		System.out.println("New Credited Account Details: ");
		System.out.println("Account No: "+toAccount.getAccountNo());
		System.out.println("Account Balance: "+toAccount.getAccountBalance());
		
		System.out.println();
		System.out.println("New Debited Account Details: ");
		System.out.println("Account No: "+fromAccount.getAccountNo());
		System.out.println("Account Balance: "+fromAccount.getAccountBalance());
	}
	public Account findAccount(int AccountNo)
	{
	int i;
	for(i=0;i<accounts.length;i++)
	{
		if(accounts[i].getAccountNo() ==  AccountNo)
			{
			//flag = 1;
			break;
			} 
	}
	return accounts[i];	
	}
}
