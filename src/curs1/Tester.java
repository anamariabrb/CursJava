package curs1;
// one line comment

/* multi line comment
*/

// UpperCamelCase
//lowerCamelCase 


public class Tester {
	//variabile
	private String nume;
	public int ratePerHour;
	
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public Tester(String nume, int rate) {
		setNume(nume);
		ratePerHour = rate;
	}




}
