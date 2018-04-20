package cg.bank;

public class Account
{
	private int accountNo;
    private double accountBalance;
    //functinal logic
    protected boolean withdraw(double amount)
    {
    	accountBalance = accountBalance - amount;
    	return true;
    }
    protected boolean deposit(double amount)
    {
    	accountBalance = accountBalance + amount;
    	return true;
    }
    //getter setters
    public int getAccountNo()    {
 	   return accountNo;
    }
    public double getAccountBalance()
    {
 	   return accountBalance;
    }
    public void setAccountNo(int accountNo)
    {
 	   this.accountNo = accountNo;
    }
    public void setAccountBalance(double accountBalance)
    {
 	   this.accountBalance= accountBalance;
    } 
}
