package Homework;

public class Homework10 {

	public static void main(String[] args) {
		
		String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam consectetur odio ac quam commodo, eu eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius malesuada. Nulla neque lacus, euismod quis erat nec, convallis vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";
		Nulla(text);
		propozitii(text);
		stergere(text,"a");
		inlocuire(text,"o");
		
	}

	public static int Nulla (String text) {
		int numar = 0;
		int pozitie = 0;
		
		while(pozitie != -1) {
			pozitie = text.indexOf("Nulla", pozitie);
			
			if(pozitie != -1) {
				
				numar++;
				
				pozitie = pozitie + "Nulla".length();
				
			}
			
		}
		System.out.println("Numarul de aparitii este de: " + numar);
		return numar;
		
	}
	
	public static void propozitii(String text) {
		
		String[] propozitii = text.split("\\.");
		
		
		for(int i = 0; i < propozitii.length; i++) {
			
			System.out.println(propozitii[i]);
			
			
		}
		
	}
	
	public static void stergere (String text, String litera) {
		
		StringBuilder sb = new StringBuilder(text);
		
		int pozitie = 0;
		while(pozitie != -1) {
			pozitie = sb.indexOf(litera);
			
			if(pozitie != -1) sb.deleteCharAt(pozitie);
		}
		System.out.println(sb);
		
	}
	
	public static void inlocuire(String text, String litera) {
		
		StringBuilder sb = new StringBuilder(text);
		
		int pozitie = 0;
		while(pozitie != -1) {
			pozitie = sb.indexOf(litera);
			
			if(pozitie != -1) {
				sb.deleteCharAt(pozitie);
				sb.insert(pozitie, "#");
			}
		}
		System.out.println(sb);
	
	}
	
	
	
	
	
	
	


}