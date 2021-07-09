package com.custom.interf;

import java.util.ArrayList;

public interface customerInterfaces {
	
	public void withdraw(Customer2 cust, int withdMoney);
	public void listCustomer(ArrayList<Customer2> list);
	public void transfer(Customer2 cust, Customer2 cust1, int transMoney);
	public void depose(Customer2 cust, int depMoney);
}
