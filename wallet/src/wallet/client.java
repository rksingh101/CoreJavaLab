package wallet;

public class client {


	public static void main(String[] args)
	{
		
		Services serv = new Services();
		
		//Functionality no 1 : Creating an account
		serv.createAccount("Raj Ramesh",170000);
		serv.createAccount("Dinesh Kartik",540000);
		serv.createAccount("Sam Shambhu",340000);
		
		
		//Functionality no 2: Showing Balance/Account details
	    serv.showBalance(3);
	    serv.showBalance(2);
	    serv.showBalance(1);
	    
	    //Functionality 3: Deposit Funds
	    serv.depositFunds(1, 9999);
	    serv.showBalance(1);
	    
	    //Functionality 4: Transfer Funds
	    serv.FundTransfer(1,2,9999);
	    serv.showBalance(1);
	    serv.showBalance(2);
	}
}
