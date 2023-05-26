package curs6;

import java.util.Scanner;

public class SwitchExample4 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Te rog introdu in ce an esti :");
		int an = scan.nextInt();

		System.out.println("Te rog introdu punctajul :");
		int punctaj = scan.nextInt();
		
		switch (an) {
		case 3:
			switch(punctaj) {
			case 80:
				System.out.println("Esti eligibil pentru bursa 1");
			case 50:
				System.out.println("Esti eligibil pentru bursa 2");
				break;
				default:
					
			}
			break;
		default: 
			System.out.println("Nu esti eligibil");
		}
		
	}

}
