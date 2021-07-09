package com.custom;

import java.util.ArrayList;
import java.util.Scanner;

public class BankApp {

	public static int showBalance(Customer1 cust) {
		return cust.getAccountBalance();
	}

	public static void depose(Customer1 cust, int depMoney) {
		int balance=cust.getAccountBalance();
		int newBalance=balance+depMoney;
		cust.setAccountBalance(newBalance);
	}

	public static boolean withdrow2(Customer1 cust, int withdMoney) {

		if(cust.getAccountBalance()>=withdMoney) {

			int balance=cust.getAccountBalance();
			int newBalance=balance-withdMoney;
			cust.setAccountBalance(newBalance);
			return true;
		}

		else {
			System.err.println("Insuficient fund...");
		}
		return false;

	}

	public static void listCustomer(ArrayList<Customer1> list) {

		for( Customer1 l: list ) {
			System.out.println("Customer Record With Id: "+l.getId());
			System.out.println(".........................................................................");
			System.out.println("Customer FirstName is: "+l.getFirstName());
			System.out.println("Customer LastName is:"+l.getFirstName());
			System.out.println("Customer Account is: "+l.getBankAccount());
			System.out.println("Customer Data Of Ragistration is: "+l.getDate());
			System.out.println("\n");
		}

	}


	public static Customer1 AddCustomer(int id) {
		Customer1 r=new Customer1();


		try {
			Scanner s=new Scanner(System.in);
			//setting id
			r.setId(id);
			System.out.println("Record The "+id+" Customer \n");

			System.out.println("Please enter firstName Of The Customer Number"+id);
			String fn=s.next();
			r.setFirstName(fn);

			System.out.println("Please enter lastName Of The Customer Number"+id);
			String ln=s.next();
			r.setFirstName(ln);
			System.out.println("Please enter date Of The Customer Number"+id);
			String m=s.next();
			r.setDate(m);
			System.out.println("Please enter Bank account Of The Customer Number"+id);
			String ab=s.next();
			r.setBankAccount(ab);
			System.out.println("Please enter Account type Of The Customer Number"+id);
			String at=s.next();
			r.setAccountType(at);
			System.out.println("Please enter AccountBalance Of The Customer Number"+id);
			int b=s.nextInt();
			r.setAccountBalance(b);
			System.out.println("\n");

		}catch(Exception e){
			e.printStackTrace();
		}

		return r;
	}

	public static void transfer(Customer1 cust, Customer1 cust1, int transMoney) {

		if(withdrow2(cust,transMoney)==true) {
			depose(cust1,transMoney);
		}
		else {
			System.err.println("No Money Transfard...");
		}
	}

	public static void main(String[] args) {

		ArrayList<Customer1> info=new ArrayList<>();

		Scanner s=new Scanner(System.in);

		while(true) {

			System.out.println(".....WELCOME TO OUR BANK.....");
			System.out.println("............MENU.............\n\n");

			System.out.println("please enter 1 to record a customer");
			System.out.println("please enter 2 to list all Customer");
			System.out.println("please enter 3 to withrouw money");
			System.out.println("please enter 4 to depose money");
			System.out.println("please enter 5 to transfer money \n\n");

			System.out.println("please enter your choice");
			int choice=s.nextInt();

			switch(choice) {

			case 1: 
				System.out.println("please enter Customer number you need to record \n");
				int n=s.nextInt();
				for(int i=1;i<=n;i++) {
					info.add(AddCustomer(i));
				}

				break;

			case 2: 
				listCustomer(info);
				break;

			case 3:
				System.out.println("plese enter your bank account");
				String y=s.next();
				int count=0;

				for(Customer1 cust:info) {

					if(cust.getBankAccount().equals(y)) {

						count++;

						//get the amount 
						System.out.println("Please enter the ammount of money you want to withdrow");
						int am= s.nextInt();

						//and withdraw
						withdrow2(cust,am);
						System.out.println("...You have withraw "+am+" successfully Your new balance is:"+cust.getAccountBalance()+"\n");
					}

				}

				if(count==0) {
					System.err.println("No customer found");
				}
				break;

			case 4:


				System.out.println("plese enter your bank account");
				String z=s.next();

				int count2=0;

				for(Customer1 cust:info) {

					if(cust.getBankAccount().equals(z)) {

						count2++;

						System.out.println("Please enter the ammount of money you want to depose");
						int am= s.nextInt();
						depose(cust,am);
						System.out.println("You have transfer "+am+" to that account Your new balance is: "+cust.getAccountBalance());
					}

				}

				if(count2==0) {
					System.err.println("No customer found");
				}
				break;



			case 5:
				int count3=0;
				System.out.println("please enter your bank account");
				String acc1=s.next();

				Customer1 cust1= null;

				for(Customer1 cust:info) {
					if(cust.getBankAccount().equals(acc1)) {
						cust1=cust;
						count3++;
					}
				}
				
				System.out.println("please enter the bank account of the person to deposit to");
				String acc2=s.next();

				Customer1 cust2= null;
				for(Customer1 cust:info) {
					if(cust.getBankAccount().equals(acc2)) {
						cust2=cust;
						count3++;
					}
				}
				
				
				//transfer
				System.out.println("plese enter money you to depose");
				int b=s.nextInt();
				transfer(cust1,cust2,b);
              System.out.println("Transfer "+b+" successfully from "+cust1.getBankAccount()+" to "+cust2.getBankAccount()+"Your new balance is: "+cust1.getAccountBalance());
				
              
              if(count3==0) {
					System.err.println("No customer found");
				}
				
				break;
			}

			System.out.println("------  Do you wnat to continue????? -----");
			System.out.println("Enter 1 to continue or any othe key to exit");
			String in=s.next();

			if(!in.equals("1")) {
				break;
			}
		}

		System.out.println("......THANK YOU FOR CHOOSING BK BANK...");
	}
}