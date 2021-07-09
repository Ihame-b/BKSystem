package com.custom.interf;

import java.util.ArrayList;
import java.util.Scanner;

public class custImplsInt implements customerInterfaces {
	
	
	@Override
	public void withdraw(Customer2 cust, int withdMoney) {
		
		if(cust.getBalance()>=withdMoney) {

			int balance=cust.getBalance();
			int newBalance=balance-withdMoney;
			cust.setBalance(newBalance);
		}
		else {
			System.err.println("Insufiscient fund...");
		}
		
	}
	
	public static Customer2 AddCustomer(int id) {
		Customer2 r=new Customer2();
		try {
			Scanner s=new Scanner(System.in);
			//setting id
			r.setId(id);
			System.out.println("Record The "+id+" Customer \n");

			System.out.println("Please enter Name Of The Customer Number"+id);
			String n=s.next();
			r.setNames(n);
			
			System.out.println("Please enter Bank account Of The Customer Number"+id);
			String b=s.next();
			r.setAccount(b);
			
			System.out.println("Please enter Your Balnce Of The Customer Number"+id);
			int c=s.nextInt();
			r.setBalance(c);
			
			System.out.println("\n");

		}catch(Exception e){
			e.printStackTrace();
		}

		return r;
	}
	
	@Override
	public void listCustomer(ArrayList<Customer2> list) {
		
		for( Customer2 l: list ) {
			System.out.println("Customer Record With Id: "+l.getId());
			System.out.println(".........................................................................");
			System.out.println("Customer FirstName is: "+l.getNames());
			System.out.println("Customer Account is: "+l.getAccount());
			System.out.println("\n");
		}

	}
	@Override
	public void transfer(Customer2 cust, Customer2 cust1, int transMoney) {
			depose(cust1,transMoney);
		}
	
	@Override
	public void depose(Customer2 cust, int depMoney) {
		int balance=cust.getBalance();
		int newBalance=balance+depMoney;
		cust.setBalance(newBalance);
		
	}
	
	
}
