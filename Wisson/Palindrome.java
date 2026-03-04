package Wisson;

import java.util.HashMap;
import java.util.Map;

// Can palindrome be formed? Given a string, check if palindrome can be formed by rearranging its characters. 
//Ex1. string: bangalore ans : false      
//Ex2. string: abdybayd ans : true
// because string can be rearranged as abdyydba

public class Palindrome {

	public static boolean canFormPalindrome(String str) {
		str = str.replaceAll("\\s", "").toLowerCase();

		Map<Character, Integer> map = new HashMap<>();

		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
			int oddCount = 0;

			for (int count : map.values()) {
				if (count % 2 != 0) {
					oddCount++;
				}
			}

			return oddCount <= 1;
		}
	

	public static void main(String[] args) {

		String str1 = "bangalore";

		String str2 = "abdybayd";

		System.out.println(str1 + " -> " + canFormPalindrome(str1));

		System.out.println(str2 + " -> " + canFormPalindrome(str2));

	}

}
