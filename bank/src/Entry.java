import cg.bank.*;
public class Entry {

	public static void main(String[] args)
	{
	
		Bank bank = new Bank();
		bank.addAccount();
        Teller teller = new Teller();
        teller.setBank(bank);	
        teller.performTransfer();
	}
}
