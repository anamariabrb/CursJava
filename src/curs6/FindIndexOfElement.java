package curs6;

public class FindIndexOfElement {

	static int [] numbers = {3, 5, 7, 8, 9, 2, 12};
	public static void main(String[] args) {
	

	}

	
	public static void rezolvarecuFor(int element) {
		
	for (int i=0; i<numbers.length; i++) {
		
		if(numbers[i]==element) {
			
			System.out.println("Index pentru " + element + "este" + i);
			
		}
	}
		
	}

 public static void rezolvareCuForEach(int number) {
	 
	 for (int element : numbers) {
		 
		 
	 }
 }

}
