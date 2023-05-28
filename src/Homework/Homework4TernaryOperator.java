package Homework;

import java.util.Scanner;

public class Homework4TernaryOperator {

	
	public static void main(String[] args) {
		
		//Exercitiul 1
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Introdu valoare factura: ");
		int factura = scan.nextInt();
		
		int reducere = (factura>100)? 10 : 5;
		
		System.out.println("Cat e reducerea: "+ reducere + "%");
		
		//Exercitiul 2
		int comision;
		int vanzari = 3500;
		
		if (vanzari>2500) comision = vanzari * 5 / 100;
		else comision = 0;
		System.out.println("Comisionul tau este: " + comision);
	
		
		//Exercitiul 3
		
		System.out.println("Introdu punctaj: ");
		int punctaj = scan.nextInt();
		
		String calificativ = (punctaj >= 90) ? "Foarte Bine" : ( (punctaj>=80) ? "Bine" : "Suficient" );
		
		System.out.println("Ai primit: " + calificativ);
			
		
	    //Exericitiul 4
		
		int numar;
		int suma = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Please enter number "+ (i+1));
		
			numar = scan.nextInt();
			
			suma += numar;
			
		}
		
		System.out.println("The sum of numbers is: " + suma);
		
		//Exercitiul 5
		
		
		System.out.println("Please enter a number: ");
		Integer number = scan.nextInt();
		
		for (Integer i = 1; i <=10; i++) {
			
			System.out.println(number.toString() + "*" + i.toString() + "=" + (number*i));
			
		}
			
		
		
	
	}

}
