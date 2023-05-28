package curs6;

public class ForEachExample {

	public static void main(String[] args) {
		String [] orase = {"Iasi", "Cluj", "Brasov", "Pitesti", "Ploiesti"};

	for (int i=0; i<orase.length; i++) {
		
		System.out.println(orase[i]);
		
		
	}
	System.out.println ("---------");
	
	for (String element : orase) {
		
		System.out.println(element);
	}
	 
	}

}
