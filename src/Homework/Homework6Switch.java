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
		
		switch (vechime) {
	
		case 3:
			if (valoareVanzari <= 5000)
				System.out.println("Primesti bonus de 600");

			
			else if (valoareVanzari <= 10000) {
				
				if(lunaEfectuareVanzari >= 1 && lunaEfectuareVanzari <= 6)
					System.out.println("Primesti bonus de 800");
			
				
				else if (lunaEfectuareVanzari >= 7 && lunaEfectuareVanzari <= 11)
					System.out.println("Primesti bonus de 1000");
			
			
				else if(lunaEfectuareVanzari == 12)
				{
					System.out.println("Primesti bonus de 900");
					System.out.println("In decembrie se vand singure");
				}
			
			
			} 
			
			else if (valoareVanzari > 10000)
				System.out.println("Primesti bonus de 1200");
		}
	

	}

}

