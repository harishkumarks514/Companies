package Flipkart;

public class SolutionMinOperation {

	public static void main(String[] args) {

		String[] command = { "flipkart/", "bbd/", "../", "2023/", "./" };

		System.out.println(SolutionMinOperation.minOperations(command));

	}

	public static int minOperations(String[] input) {
		int move = 0;

		for (int i = 0; i < input.length; i++) {
			if (input[i].equals("../")) {
				if (move > 0) {
					move--;
				}
			}
				else if (input[i].equals("./")) {

				} else {
					move++;
				}

		}
		return move;
	}

}
