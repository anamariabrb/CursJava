package curs10;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		
		String [] myStringArray = {"Oana", "Ion", "Bogdan", "Ion", "Maria","Oana"};
			for(int i = 0; i< myStringArray.length; i++) {
				
				for(int j = i + 1; i<myStringArray.length; j++) {
					
					if(myStringArray[i].equals(myStringArray[j]));
					
					System.out.println("Nume duplicat: "+ myStringArray[i]);
				
				}
				
		}

	}

}
