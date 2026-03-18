package Synechron;

public class findKthLargestQuickSort {

	public static int findKthLargest(int[] nums, int k) {
		return quickSelect(nums, 0, nums.length - 1, nums.length - k);
	}

	static int quickSelect(int[] nums, int left, int right, int k) {

		int pivot = nums[right];
		int p = left;

		for (int i = left; i < right; i++) {
			if (nums[i] <= pivot) {
				int temp = nums[i];
				nums[i] = nums[p];
				nums[p] = temp;
				p++;
			}
		}

		int temp = nums[p];
		nums[p] = nums[right];
		nums[right] = temp;

		if (p == k)
			return nums[p];
		else if (p < k)
			return quickSelect(nums, p + 1, right, k);
		else
			return quickSelect(nums, left, p - 1, k);
	}

	public static void main(String[] args) {

		int[] nums = { 3, 2, 1, 5, 6, 4 };
		int k = 2;

		System.out.println(findKthLargest(nums, k));
	}
}