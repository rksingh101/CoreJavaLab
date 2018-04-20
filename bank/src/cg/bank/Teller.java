package cg.bank;
import java.util.Random;
public class Teller 
{
	Bank bank;
	public void performTransfer()
	{
		Random rand = new Random();
		// Generate random integers in range 0 to 4
        int toAccountNo = rand.nextInt(4);
		
        Account toAccount = bank.findAccount(toAccountNo);
        bank.transferAmount(toAccount, fromAccount, amount)
		}
}