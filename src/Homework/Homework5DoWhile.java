package Homework;


  import java.util.Scanner;

  public class Homework5DoWhile {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
	
		
		int i = 0;
		boolean loginSuccess = false;
		
		do {
			
			System.out.println("Write username: ");
			String username = scan.next();
			
			System.out.println("Write password: ");
			String password = scan.next();
			
			if (username == "TestUser"&& password == "1234") {
				
				System.out.println("Login successful");
			
				loginSuccess = true;
				break;	
			
			} else {
				
				System.out.println("Login error");
			}
			
			
		
			
			i++;
		} while(i < 3);
		
		if(loginSuccess == false) {
			
			System.out.println("Maximum attempts reached. User blocked");
		}
			
		
		// Exercitiul 2
		
		int numereFibonacci = 9;
		
		int nr1 = 0;
		int nr2 = 1;
		
		System.out.println(0);
		System.out.println(1);
		
		for(int n= 0; n < numereFibonacci-2; n++ ) {
			
			int nrCurent = nr1 + nr2;
			System.out.println(nrCurent);
			
			nr1 = nr2;
			nr2 = nrCurent;
		}
		
			
	}

}
