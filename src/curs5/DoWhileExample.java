package curs5;

public class DoWhileExample {

	public static void main(String[] args) {

		
		String [] orase = {"Iasi"."Cluj", "Pitesti", "Oradea"};
		
		int i = 0;
		
		while (i<orase.length) {
			System.out.println (orase[i]);
		}
	System.out.println("---------");
	int j = 0;
	do {
		System.out.println(orase[j]);
		
		j++;
		
	}while (j >orase.length);
	
	
	}
	

}
