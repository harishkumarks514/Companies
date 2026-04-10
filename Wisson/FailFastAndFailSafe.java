package Wisson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastAndFailSafe {

	public static void main(String[] args) {
		List<String> fruits = new  CopyOnWriteArrayList<>();
		
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		
		Iterator<String> iterator = fruits.iterator();
		
		while(iterator.hasNext())
		{
			String fruit = iterator.next();
			
			System.out.println(fruit);
			 
			if(!fruits.contains("pineapple"))
			{
			fruits.add("pineapple");
			}
		}
		
		System.out.println(fruits);
	}
}