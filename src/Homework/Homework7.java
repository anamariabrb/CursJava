package Homework;

import java.util.Scanner;

public class Homework7 {

	public static void main(String[] args) {
		
		//Exercitiul 1
		Scanner scan = new Scanner (System.in);
		
		
		System.out.println("Cate elemente trebuie sa aiba array-ul: ");
		int nrElemente = scan.nextInt();
		
		int[] arrayNr = new int [nrElemente];
		
		for(int i= 0; i < nrElemente; i++) {
			
			System.out.println("Introdu elementul " + i + ": ");

			arrayNr[i] = scan.nextInt();
				
		}
		
		//for
		System.out.print("Array reversed: " );
		for(int i = nrElemente - 1; i >= 0; i--)
		{
			System.out.print(arrayNr[i] + " ");
		}
		
		
		//while
		System.out.print("Array reversed: " );
		
		int i = nrElemente - 1;
		while(i >= 0)
		{
			System.out.print(arrayNr[i] + " ");
			i--;
		}
		
		//Exercitiul 2 - apelare functii
		
		Qualifications calificare = new Qualifications("java", 4, "Afternoon");
		calificare.verify();
	
		//Exercitiul 3
		
	
		int numere = 10;
		
		int []listaNr = new int [numere];
		
		for (int j = 0; j < numere; j++) {
			System.out.println("Introdu numar " + (j+1) + ":");
			
			listaNr[j] = scan.nextInt();
			
		}
		
		for (int j = 0; j < numere; j++) {
			
			if(listaNr[j] % 2 == 0) {
				System.out.print(listaNr[j] + " ");
			}
		}
		int j = 0;
		while (j < numere) {
			
			if(listaNr[j] % 2 == 0) {
				System.out.print(listaNr[j] + " ");
			}
			j++;
			
		}
	}
		
}

//Exercitiul 2

class Teacher{
	String course;
	int experienceYears;
	String schedule;
	
	public Teacher (String course,int experienceYears, String schedule){
		this.course = course;
		this.experienceYears = experienceYears;
		this.schedule = schedule;
	 
	}
	
	
}

 class Qualifications extends Teacher{
	
	public Qualifications (String course,int experienceYears, String schedule){
		 super(course, experienceYears, schedule);
	}
	public boolean verify() {
		
		if (experienceYears > 3 && course.equals("java") && schedule.equals("Afternoon")) {
			
			System.out.println("You qualify to teach at this school!");
			return true;
			
		}else {
			
			System.out.println("You do not qualify!");
		
			return false;
		}
	
	}
	
	
}