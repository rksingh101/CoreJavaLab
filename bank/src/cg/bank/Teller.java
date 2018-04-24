package cg.bank;
import java.util.Random;
public class Teller 
{
	Bank bank;
	public void performTransfer()
	{
		//bank = new Bank();
		Random rand = new Random();
		// Generate random integers in range 1 to 5
		int i = 0;
		while(true)
		{
        int toAccountNo = rand.nextInt((5 - 1) + 1) + 1;
		int fromAccountNo = rand.nextInt((5 - 1) + 1) + 1;
		
		//System.out.println(toAccountNo+" "+fromAccountNo);
		double amount = 11000;
		Account toAccount = bank.findAccount(toAccountNo);
        Account fromAccount = bank.findAccount(fromAccountNo);
		bank.transferAmount(toAccount, fromAccount, amount);
		//bank.showTotalBalance(toAccount, fromAccount);
		if(i>=5)
			break;
		i++;
		}
	}
	public void setBank(Bank bank)
	{
		this.bank = bank;
	}
	public Bank getBank()
	{
		return bank;
	}
}