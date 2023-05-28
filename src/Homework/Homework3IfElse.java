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
		
		System.out.print("Introdu ziua: ");
		
		int ziua = scan.nextInt();
		if  (ziua == 0) System.out.println("Te rog sa introduci un numar mai mare ca 0");
		else if (ziua == 1) System.out.println("Astazi este luni");
		else if (ziua == 2) System.out.println("Astazi este marti");
		else if (ziua == 3) System.out.println("Astazi este miercuri");
		else if (ziua == 4) System.out.println("Astazi este joi");
		else if (ziua == 5) System.out.println("Astazi este vineri");
		else if (ziua == 6) System.out.println("Astazi este sambata");
		else if (ziua == 7) System.out.println("Astazi este duminica");
	
		else System.out.println("Saptamana are doar 7 zile te rog sa introduci un numar valid");
	
	}


}
