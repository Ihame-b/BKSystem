package com.custom.interf;

import java.util.ArrayList;
import java.util.Scanner;

public class TestCustomer {

	public static void main(String[] args) {

		custImplsInt r=new custImplsInt();
		ArrayList<Customer2> info=new ArrayList<>();

		Scanner s=new Scanner(System.in);

		while(true) {

			System.out.println("==== WELCOME TO OUR BK BANK ====");
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
					info.add(r.AddCustomer(i));
				}

				break;

			case 2: 
				r.listCustomer(info);
				break;

			case 3:
				System.out.println("plese enter your bank account");
				String y=s.next();
				int count=0;

				for(Customer2 cust:info) {

					if(cust.getAccount().equals(y)) {

						count++;

						//get the amount 
						System.out.println("Please enter the ammount of money you want to withdrow");
						int am= s.nextInt();

						//and withdraw
						r.withdraw(cust,am);
						System.out.println("...You have withraw "+am+" successfully Your new balance is:"+cust.getBalance()+"\n");
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

				for(Customer2 cust:info) {

					if(cust.getAccount().equals(z)) {

						count2++;

						System.out.println("Please enter the ammount of money you want to depose");
						int am= s.nextInt();
						r.depose(cust,am);
						System.out.println("You have transfer "+am+" to that account Your new balance is: "+cust.getBalance());
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

				Customer2 cust1= null;

				for(Customer2 cust:info) {
					if(cust.getAccount().equals(acc1)) {
						cust1=cust;
						count3++;
					}
				}
				
				System.out.println("please enter the bank account of the person to deposit to");
				String acc2=s.next();

				Customer2 cust2= null;
				for(Customer2 cust:info) {
					if(cust.getAccount().equals(acc2)) {
						cust2=cust;
						count3++;
					}
				}
				
				
				//transfer
				System.out.println("plese enter money you to depose");
				int b=s.nextInt();
				r.transfer(cust1,cust2,b);
              System.out.println("Transfer "+b+" successfully from "+cust1.getAccount()+" to "+cust2.getAccount()+"Your new balance is: "+cust1.getBalance());
				
              
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


