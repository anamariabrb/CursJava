package curs6;
import java.util.Scanner;

public class SwitchExample2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introdu o litera :");
		char litera = scan.next().charAt(0);
		
	switch (litera) {
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U': System.out.println("Este vocala!");
	break;
	default:
		System.out.println ("Este consoana");
	
	
	
	
	}
	}

}
