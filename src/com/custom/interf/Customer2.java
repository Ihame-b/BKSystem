package com.custom.interf;

public class Customer2 {

	String names;
	int id;
	int Balance;
	String Account;
	public Customer2(String names, int id, int balance, String account) {
		this.names = names;
		this.id = id;
		Balance = balance;
		Account = account;
	}
	public Customer2() {
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		Balance = balance;
	}
	public String getAccount() {
		return Account;
	}
	public void setAccount(String account) {
		Account = account;
	}
	
	@Override
	public String toString() {
		return "Customer2 [names=" + names + ", id=" + id + ", Balance=" + Balance + ", Account=" + Account + "]";
	}
	
	
	
}
