package Homework;
import java.util.Scanner;

public class Homework3IfElse {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Introdu varsta: ");
	
		int varsta = scan.nextInt();
		if (varsta < 18 ) System.out.println("Esti minor");
	
		else if (varsta >= 18 && varsta <= 65) System.out.println("Esti adult");
		else System.out.println("Esti batran");
	
		
		// Exercitiul 2

		System.out.print("Introdu punctaj: ");
	
		int punctaj = scan.nextInt();
		if (punctaj >= 0 && punctaj <= 65) System.out.println ("Ai picat. Mai incearca");
		else System.out.println("Felicitari, ai trecut!");
		
	
		// Exericitiul 3
//		
//		System.out.print("Introdu ziua");
//		
//		int ziua = scan.nextInt();
//		if 
	}


}
