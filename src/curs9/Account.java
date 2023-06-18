package curs9;

public class Account {
	
	public int balance = 0;
	
	public void deposit(int amonut) {
		
		if(amonut <= 0) {
		//	throw new InvalidAmnoutException(amonut + " is not valid!");
		}
		
		balance = balance + amonut;
	}
	

}
