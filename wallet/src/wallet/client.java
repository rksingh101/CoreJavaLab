package wallet;

public class client {


	public static void main(String[] args)
	{
		
		Services serv = new Services();
		serv.createAccount("Raj Ramesh", 170000);
		//System.out.println(ac);
		
		serv = new Services();
		serv.createAccount("Dinesh Kartik",980000);
		//System.out.println(ac);
		
		serv = new Services();
		serv.createAccount("Sam Shambhu", 340000);
		//System.out.println(ac);
		
	    serv.showBalance(3);
	    
	    serv.showBalance(2);
	    
	    serv.showBalance(1);
	}
}
