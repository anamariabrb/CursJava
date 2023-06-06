package curs8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
		System.out.println("enter num1: ");
		
		int num1 = scan.nextInt();
		
		System.out.println("enter num2: ");
		
		int num2 = scan.nextInt();
		
		int sum = num1/num2;
		
		System.out.println(sum);
	}catch (InputMismatchException e) {
	System.out.println("Insert only numeric values" );	
		
	}catch(ArithmeticException e) {
		
		System.out.println("do not devide by zero");
		
	}

}
}