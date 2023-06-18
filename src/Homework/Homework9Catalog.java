package Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework9Catalog {

	public static void main(String[] args) {
		
		Map <String, Integer> catalog = new HashMap <>();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Cum te cheama?");		
			String nume = scan.next();
			
			System.out.println("Ce nota ai luat?");		
			int nota = scan.nextInt();
			
			if(catalog.containsKey(nume)) {
				int notaCatalog = catalog.get(nume);
				if(nota <= notaCatalog) {
					System.out.println("Nu ai nevoie de alta nota!");
			
				}
				else {
					catalog.replace(nume, nota);
					System.out.println("Am actualizat nota!");
					
				}
			}
			else {
				catalog.put(nume, nota);
				System.out.println("Nu aveai nota, ti-am trecut acum!");
			}
			
			System.out.println(catalog);
		}
	}

}
