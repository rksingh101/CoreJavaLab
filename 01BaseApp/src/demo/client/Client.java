package demo.client;

import java.util.HashMap;
import java.util.Map;

import demo.beans.Customer;
import demo.repo.WalletRepo;
import demo.repo.WalletRepoImpl;
import demo.service.WalletService;
import demo.service.WalletServiceImpl;

public class Client {
	public static void main(String[] args)
	{
		Map<String, Customer> data = new HashMap<>();
		WalletRepo repo =  new WalletRepoImpl(data);
		WalletService service = new WalletServiceImpl(repo);
		
		service.createAccount("RK", "9674632276", 10000);
		service.createAccount("Indranil", "2437656777", 9000);
		service.createAccount("SaiRam", "7664545666", 7000);
		service.createAccount("Pragya", "1212121223", 5000);
		service.createAccount("Teena", "9674645454", 7000);
		
		System.out.println(service.showBalance("2437656777"));
		System.out.println();
		System.out.println(service.showBalance("1212121223"));
	}

}
