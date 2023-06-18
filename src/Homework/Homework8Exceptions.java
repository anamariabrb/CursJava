package Homework;

import java.util.Scanner;

public class Homework8Exceptions {

	public static void main(String[] args) {
		
		TestSavingAccount.Test();
	}
}

class Customer{
	
	private String name;
	private String address;
	private String email;
	
	Customer (String name, String address, String email){
		this.name = name;
		this.address = address;
		this.email = email;
	}
	public String getName() {
		
		return name;
	}
}

class Account{
	
	private int accountNumber;
	public double balance;
	public Customer accountOwner;


	Account(int accountNumber, double balance, Customer accountOwner){
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.accountOwner = accountOwner;
	}
		
	public void withdraw(int sum) throws InsuficentFundsException {
		if(balance < sum) throw new InsuficentFundsException ();
		else balance = balance - sum;	
	}
}


class InsuficentFundsException extends Exception {
	
	InsuficentFundsException () {
		super ("Insuficent funds for transaction");
		}	
}

class SavingsAccount extends Account {
	
	SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
		super (accountNumber, balance, accountOwner);
	}
	
	public void withdraw(int sum) throws InsuficentFundsException {
		if(balance < sum) throw new InsuficentFundsException ();
		else balance = balance - sum;	
	}	
}

class TestSavingAccount{
	
	public static void Test() {
		
		Customer dragos = new Customer("Dragos","strada Libertatii", "d@yahoo.com");
		
		SavingsAccount contDragos = new SavingsAccount(123456789, 150.0, dragos);
		
		System.out.println("Hi, " + dragos.getName());
	
		System.out.println("Please enter the amount to withdraw: ");
		Scanner scan = new Scanner(System.in);
		int amount = scan.nextInt();
	
		try {
			contDragos.withdraw(amount);
			
			System.out.println("Please pick up your money!");
			System.out.println("Your new balance is: "+ contDragos.balance);	
		}
		catch (InsuficentFundsException e) {
			System.out.println("The amount you entered is greater than the available balance " + contDragos.balance);
		
			e.printStackTrace();
		}
		finally {
			System.out.println("Thank you for using our ATM!");
		}
		
	}
			
}