package cg.bank;
import java.util.Random;
public class Teller 
{
	private Bank bank;
	public void performTransfer() throws InterruptedException
	{
		Random rand = new Random();
		// Generate random integers in range 1 to 5
		int i = 0;
		while(true)
		{
		//	System.out.println("Exchanged"+i);
        int toAccountNo = rand.nextInt((5 - 1) + 1) + 1;
		int fromAccountNo = rand.nextInt((5 - 1) + 1) + 1;
		double amount = 110;
		//Standard amount as example to be passed around
		Account toAccount = bank.findAccount(toAccountNo);
        Account fromAccount = bank.findAccount(fromAccountNo);
		bank.transferAmount(toAccount, fromAccount, amount);
		if(i>20)
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