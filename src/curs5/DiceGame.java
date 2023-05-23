package curs5;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int dice1;
		int dice2;
		
		
		boolean startJoc = true;
		
		
		
		while (startJoc) {
			dice1 = (int) (Math.random()*6+1);
			dice2 = (int) (Math.random()*6+1);
			int total = dice1 + dice2;
			
			
			
			System.out.println("Ai dat  :" + total);
			
			
			if (total ==2 || total ==6 || total ==12) {
				System.out.println("Imi pare rau. Ai dat " + total);
				//break;
				startJoc = false;
				
				
			}else if (total ==4 || total ==8 || total ==11) {
				
				System.out.println("Automat mai dai o data");
			
			}else if(total ==3 || total ==7) {
				
				System.out.println("You're the winner!");
				startJoc = false;
			
			}else {
				System.out.println("Ai dat :" + total + "Mai vrei sa joci?");
			}
			
			
		}
		System.out.println("Game over!");
	}

}
