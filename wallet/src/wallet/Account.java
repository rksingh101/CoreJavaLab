package wallet;

public class Account {
       private int accountNo;
       private double accountBalance;
       private Customer customer;
       public int getAccountNo()
       {
    	   return accountNo;
       }
       public double getaccountBalance()
       {
    	   return accountBalance;
       }
       public Customer getCustomer()
       {
    	   return customer;
       }
       public void setAccountNo(int accountNo)
       {
    	   this.accountNo = accountNo;
       }
       public void setAccountBalance(double accountBalance)
       {
    	   this.accountBalance= accountBalance;
       }
       public void setCustomer(Customer customer)
       {
    	   this.customer= customer;
       }
       /*public String toString()
       {
    	   return "Name: "+customer.getCustomerName()+" Account no: "+accountNo+" Balance: "+accountBalance;
       }*/
}
