package curs7;

public class Patrat extends Shape{

	public Patrat(String nume, String culoare) {
		super(nume, culoare);
		
		
		
	}
	
	String nume = "Patrat";
	String culoare = "Negru";
	
	public void printDetails() {
		
		System.out.println("Nummele este " + nume + "si culoare este" + culoare);
	}
	
	

}
