package InRhythm_Prep;

public class SmallestMissingPositive {

	public int solution(int[] A) {
		int n = A.length;
		// Step 1 : Place elements in correct positions

		int i = 0;
		while (i < n) {
			int CorrectIndex = A[i] - 1;
			if (A[i] > 0 && A[i] <= n && A[i] != A[CorrectIndex]) {
				// Swap A[i] with A[CorrectIndex]
				int temp = A[i];
				A[i] = A[CorrectIndex];
				A[CorrectIndex] = temp;
			} else {
				i++;
			}
		}

		// Step 2 : find first missing positive
		for (int j = 0; j < n; j++) {
			if (A[j] != j + 1) {
				return j + 1;
			}
		}

		return n + 1;
	}

	public static void main(String[] args) {
		SmallestMissingPositive obj = new SmallestMissingPositive();
		int[] A = { 1, 3, 6, 4, 1, 2 };

		int result = obj.solution(A);
		System.out.println(" Smallest Missing positive element is :-    " + result);
	}
}