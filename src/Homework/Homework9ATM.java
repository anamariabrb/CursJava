package Homework;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/*
 * Simulam un ATM
 * Informam userul operatiunile disponibile sub forma :
 * 1 Deposit
 * 2 Withdraw
 * 3 CheckBalance
 * 
 * Il intrebam ce operatiune vrea sa faca (1 , 2 sau 3)
 * si procesam operatiunea: 
 * (Deposit inseamna balanta + suma depusa)
 * (Withdraw inseamna balanta - suma retrasa)
 * (Check balance - print balanta)
 * Daca incearca sa depuna mai putin sau egal cu 0 aruncam InvalidAmountEception
 * Daca incearca sa retraga mai mult decat balanta aruncam InsuficentFundsException
 * Daca introduce alta operatriune printam operatiune invalida
 * La finalul fiecarei operatiuni il intreabam daca vrea sa continue
 * Plecam cu balanta 0
 */

class BankApp {

	public static void RunATM() {
		ATM atm =  new ATM();
		BankApp bank =  new BankApp();
		bank.printeazaOperatiuni();
		
		
		ATMAccount account = new ATMAccount();
		Scanner scan  = new Scanner(System.in);
		while (true) {
			System.out.println("Please enter the desired operation:");
			int action = scan.nextInt();	
		
			switch (action) {
			
			case 1 : 
				System.out.println("Please enter the amount: ");
				int amount = scan.nextInt();		
				try {
					account.deposit(amount);
				}
				catch (InvalidAmountException e) {
					System.out.println("You entered an invalid amount");
				}
				break;
				
			case 2:
				System.out.println("Please enter the amount: ");
				int suma = scan.nextInt();		
				try {
					account.withdraw(suma);
				}
				catch (InsuficentFundsException2 e) {
					System.out.println("You don't have enough money");
				}
				break;
				
			case 3:
				System.out.println("Your balance is: "+ account.getBalance());
				break;
			
			default:	
				System.out.println("You entered an invalid operation!");
				break;
			}
			System.out.println("Do you want to continue? (Y/N)  ");
		
			String intrebare = scan.next();
			if(intrebare.equals("N") || intrebare.equals("n")) break;
				
		}
		
		
	}
	
	public void printeazaOperatiuni() {
		System.out.println("Hi, Available operations are:");
		System.out.println("1  Deposit");
		System.out.println("2  Withdraw");
		System.out.println("3  Check Balance");

	}
}

class ATMAccount {
	
	public int balance = 0;
	
	public void deposit(int amount) throws InvalidAmountException {
		
		if(amount <= 0) {
			throw new InvalidAmountException(amount + " is not valid!");
		}
		
		balance = balance + amount;
	}
	
	public void withdraw (int amount) throws InsuficentFundsException2 {
		
		if (amount > balance) {
			throw new InsuficentFundsException2 ("You don't have enough money!");
		}
		
		balance = balance - amount;
	}
	
	public int getBalance () {
		return balance;
		
	}
}

class ATM {
	
	public Map<Integer, String> operatiuni;
	
	public ATM() {
		
		operatiuni = new HashMap<>();
		operatiuni.put(1, "Deposit");
		operatiuni.put(2, "Withdraw");
		operatiuni.put(3, "Check Balance");

	}
}


public class Homework9ATM {

	public static void main(String[] args) {
		BankApp.RunATM();
	}

}

class InvalidAmountException extends Exception {
	
	InvalidAmountException (String mesaj) {
		super (mesaj);
		}	
}

class InsuficentFundsException2 extends Exception {
	
	InsuficentFundsException2 (String mesaj) {
		super (mesaj);
		}	
}
