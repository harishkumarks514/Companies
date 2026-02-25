package SAP;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> names = new HashSet<>();
		
		// Adding Elements
		names.add("harish");
		names.add("Kumar");
		names.add("harish"); // Duplicate names harish
		names.add(null);
		
		//Printing hashset
		System.out.println("Hashset : "+names);
		
		//checking elements
		System.out.println("Contains Harish ? :" + names.contains("harish"));
		
		//remove elements kumar
		names.remove("Kumar");
		
		// After removal 
		System.out.println("after removal"+names);
		
		//Size
		System.out.println(names.size());
		
	}
}
