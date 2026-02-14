package TCS;

import java.util.Arrays;
import java.util.Optional;

public class SecondHighest_Stream {

	public static void main(String[] args) {

		int[] arr = { 10, 5, 20, 8, 25, 15,30 };

		Optional<Integer> secondHighest = Arrays.stream(arr)
				.boxed()
				.distinct()
				.sorted((a, b) -> b - a)
				.skip(1)
				.findFirst();

	 
		if (secondHighest.isPresent()) {
			System.out.println("Second Highest number  : " + secondHighest.get());
			
		} else {
			System.out.println("No second Highest Number found");
		}

	}
}