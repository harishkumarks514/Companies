package Wisson;

import java.util.HashMap;
import java.util.Map;

public class StringFreequency {
	public static void main(String[] args) {
		String str = "Programming";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char ch : str.toCharArray() )
		{
			map.put(ch , map.getOrDefault(ch, 0) + 1);
		}
		System.out.print(map);
	}

}
