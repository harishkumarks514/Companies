package Wisson;

import java.util.Arrays;
import java.util.Comparator;

public class sortWordsByLengthStable {

    public static void main(String[] args) {
        String input = "Java is amazing";

        String result = sortWordsByLengthStableMethod(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }

    public static String sortWordsByLengthStableMethod(String sentence) {
        // Split sentence into words
        String[] words = sentence.split(" ");

        // Sort words by length (stable sort)
        Arrays.sort(words, Comparator.comparingInt(String::length));

        // Join words back into a string
        return String.join(" ", words);
    }
}