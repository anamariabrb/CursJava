package Homework;

import java.util.Scanner;

public class Homework6Switch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introdu anul de vechime in firma: ");
		int vechime = scan.nextInt();
		
		
		switch (vechime) {
		
		case 1:
			System.out.println("Primesti un bonus de 100");
			break;
		case 2:
			System.out.println("Primesti bonus de 200");
			
		break;
		
		}
		
		System.out.println("Introdu valoarea vanzarilor: ");
		int valoareVanzari = scan.nextInt();
		
	
		System.out.println("Introdu luna efectuarii vanzarilor: ");
		int lunaEfectuareVanzari = scan.nextInt();
		switch (valoareVanzari) {
	
		case 3:
			if (valoareVanzari <= 5000)
				System.out.println("Primesti bonus de 600");

			
			else if (valoareVanzari <= 10000)
				for(lunaEfectuareVanzari = 1; lunaEfectuareVanzari < 6; lunaEfectuareVanzari++);
		
		System.out.println("Primesti bonus de 800");
		
		}
		

	

}

	}

