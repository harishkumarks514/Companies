package Krishpar_Technologies;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "programming";

        Map<Character, Integer> map = new HashMap<>();

        // Count character occurrences
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Print unique characters
        System.out.print("Unique characters: ");
        for (char ch : str.toCharArray()) {
            if (map.get(ch) == 1) {
                System.out.print(ch + " ");
            }
        }
    }
}