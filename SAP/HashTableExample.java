package SAP;

import java.util.Hashtable;

public class HashTableExample {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> employees = new Hashtable<>();
		
		//Adding key-value pairs
		employees.put(101, "Harish");
		employees.put(102, "Kumar");
		employees.put(103, "Ravi");

		
		//Printing Hashtable
		System.out.println("Hashtable :" + employees);
		

		//Getting value by key
		System.out.println("Employee 101 : "  + employees.get(101));
	
	// Checking key/value
		System.out.println("Contains key 102? " + employees.containsKey(102));
        System.out.println("Contains value Ravi? " + employees.containsValue("Ravi"));

        //Removeing key
        employees.remove(103);
        System.out.println("After removal: " + employees);
        
        // Size
        System.out.println("Size: " + employees.size());
		
	}
}
