package curs6;

public class ArrayExample {

	public static void main(String[] args) {
		
		String [] textArray = new String [5];
//String textArray = {null, null, null, null, null};
		//index:		0	1		2	3	
		textArray [1] = "Maria";
		
		System.out.println(textArray[1]);
		System.out.println(textArray[3]);
		textArray [3] = "Oana";
		System.out.println(textArray[3]);
		
		System.out.println("--------");
		
		
		try {
			
		
		System.out.println(textArray[5]);
		
		}catch(Exception e) {
			System.out.println("Ai incercat sa accesezi in afara array-ului");
			
			
		}
		
	}

}
