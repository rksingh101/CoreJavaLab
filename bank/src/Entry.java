import cg.bank.*;
public class Entry {

	public static void main(String[] args) throws InterruptedException
	{
	
		Bank bank = new Bank();
		bank.addAccount();
		Teller teller = new Teller();
        teller.setBank(bank);	
        
        Thread teller1 = new TellerThread1(teller);
        teller1.setName("First Teller Thread");
		Thread teller2 = new TellerThread1(teller);
		teller2.setName("Second Teller Thread");
		
		teller1.start();
		teller2.start();
		
		teller.getBank().showTotalBalance();
		System.out.println("End of main()....");
	}
}
	
	class TellerThread1 extends Thread 
	{
		private Teller teller;

		public TellerThread1(Teller teller) {
			this.teller = teller;
		}

		
		public void run() {
			try {
				teller.performTransfer();
			 } catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
