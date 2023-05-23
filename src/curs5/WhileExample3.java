package curs5;

import java.util.Scanner;

public class WhileExample3 {

	public static void main(String[] args) {
		int ratePerHour = 20;
		System.out.println("Cate ore ai lucrat saptamana aceasta?")
		Scanner scan = new Scanner(System.in);
		
		int oreLucrate = scan.nextInt();
		
		while (oreLucrate < 1 || oreLucrate >40) {
			
			System.out.println("Numar invalid. Introdu un numar valid de ore");
			oreLucrate = scan.nextInt();
			
			
		}
		System.out.println ("Salariul tau este :" + oreLucrate*ratePerHour);
	}

}
