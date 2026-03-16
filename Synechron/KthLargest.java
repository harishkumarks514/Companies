package Synechron;

import java.util.Arrays;

public class KthLargest {

	public static int findKthLargest(int[] arr, int k){
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		System.out.println(arr.length-k);
		return arr[arr.length - k];
	}
	
	public static void main(String[] args)
	{
		int [] arr = {3,2,1,5,6};
		int k = 2;
		System.out.println(findKthLargest(arr, k));
	}
}