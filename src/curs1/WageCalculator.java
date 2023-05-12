package curs1;

public class WageCalculator {

	public static void main(String[] args) {
		Tester tester1 = new Tester("Oana", 30);
		tester1.setNume("Oana");
		System.out.println(tester1.getNume());
		

		Tester tester2 = new Tester("ioana", 25);
		tester2.setNume("Ioana");
		
		System.out.println(tester2.getNume());
	}

}
