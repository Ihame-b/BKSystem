package com.custom;

public class Customer1 {
	
private	int id; 
private	String firstName;
private	String lastName;
private	String date;
private	String bankAccount;
private	String accountType;
private	int accountBalance;
public Customer1(int id, String firstName, String lastName, String date, String bankAccount, String accountType,
		int accountBalance) {
	
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.date = date;
	this.bankAccount = bankAccount;
	this.accountType = accountType;
	this.accountBalance = accountBalance;
}
public Customer1() {
	
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String newFirstName) {
	firstName = newFirstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String newLastName) {
	lastName = newLastName;
}
public String getDate() {
	return date;
}
public void setDate(String newDate) {
	date = newDate;
}
public String getBankAccount() {
	return bankAccount;
}
public void setBankAccount(String bankAccount) {
	this.bankAccount = bankAccount;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public int getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(int accountBalance) {
	this.accountBalance = accountBalance;
}
@Override
public String toString() {
	return "Customer1 [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", date=" + date
			+ ", bankAccount=" + bankAccount + ", accountType=" + accountType + ", accountBalance=" + accountBalance
			+ "]";
}

}
