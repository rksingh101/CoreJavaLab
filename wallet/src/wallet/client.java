package wallet;

public class client {


	public static void main(String[] args)
	{
		
		Services serv = new Services();
		Account ac = serv.createAccount("Raj", 170000);
		//System.out.println(ac);
		
		serv = new Services();
		ac = serv.createAccount("Dinesh", 1780000);
		//System.out.println(ac);
		
		serv = new Services();
		ac = serv.createAccount("Sam", 340000);
		//System.out.println(ac);
		
	    serv.showBalance(3);
	    
	    serv.showBalance(2);
	    
	    serv.showBalance(1);
	}
}
