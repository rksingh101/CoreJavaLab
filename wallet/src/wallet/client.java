package wallet;

public class client {


	public static void main(String[] args)
	{
		Repository repo = new Repository();
		Services serv = new Services();
		Account ac = serv.createAccount("Raj", 170000);
		//System.out.println(ac);
		
		serv = new Services();
		ac = serv.createAccount("Dinesh", 1780000);
		//System.out.println(ac);
		
		serv = new Services();
		ac = serv.createAccount("Sam", 340000);
		//System.out.println(ac);
		
		System.out.println();
	    repo.findAccount(3);
	    
	    System.out.println();
	    repo.findAccount(2);
	    
	    System.out.println();
	    repo.findAccount(1);
	}
}
