package curs7;

public class TestShape  {

	public static void main(String[] args) {
		
		
		Patrat patrat = new Patrat("Cerc", "Galben");
		
		System.out.println(patrat.nume);
		
		System.out.println(patrat.culoare);
		
		patrat.printDetails();
	}

}
