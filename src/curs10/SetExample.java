package curs10;

import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
		set.add(("mov"));
		set.add(("alb"));
		set.add(("rosu"));
		set.add(("galben"));
	
		
		for(String element : set) {
			System.out.println(element);
		}
		
	}

}
