package Homework;

public class Homework2Shape {

public int calculateSquareArea(int length) {
	return length * length;
	
}
	
public int calculateRectangleArea(int length, int width) {

	return length * width;
	
	}

Homework2Shape(int latura){
	System.out.println("Afiseaza aria patratului " + calculateSquareArea(latura));
}


Homework2Shape(int latura1, int latura2){
		System.out.println("Afiseaza aria dreptunghiului " + calculateRectangleArea(latura1, latura2));
		
	}
Homework2Shape(double raza){
	System.out.println("Afiseaza aria cercului " + Math.PI * raza * raza);
	

	
}

}



