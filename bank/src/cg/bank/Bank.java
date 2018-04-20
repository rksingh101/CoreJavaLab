package cg.bank;

public class Bank {
	private Account[] accounts = new Account[5];
	
	public void addAccount()
	{
		
	}
	public void transferAmount(Account toAccount,Account fromAccount,double amount)
	{
        findAccount(toAccount.getAccountNo()).deposit(amount);
		findAccount(fromAccount.getAccountNo()).withdraw(amount);
    }
	public void showTotalBalance()
	{
		
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
