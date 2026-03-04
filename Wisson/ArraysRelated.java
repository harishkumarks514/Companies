package Wisson;

//You are given an array of stock prices, where each element represents the price of a stock at a specific point in time. The prices are ordered by time, meaning the first element is the earliest price, and the last element is the most recent price.
//
//Your task is to determine the maximum possible loss that could occur by buying at a higher price at an earlier time and selling at a lower price at a later time.
//
//Specifically, you need to identify the worst trade where you buy at the highest price first and then sell at the lowest price later.
//
//Problem Requirements:
//Find the maximum loss you could incur by making the worst possible trade in the given array of prices.
//Example:
//Input:
//int[] prices = {100, 180, 260, 310, 40, 535, 695, 30};
//Output:
//Maximum possible loss: -665
//Explanation:
//The maximum loss occurs when you buy at the highest price (695) and sell at the lowest price (30).
//The loss would be: 30 - 695 = -665.
//Thus, the worst possible trade results in a loss of -665. 
 

public class ArraysRelated {
	
	public static int maxLoss(int[] prices)
	{
		
		if(prices == null || prices.length < 2) {
		return 0;
		}
		
		int maxPriceSofar = prices[0];
		int maxLoss=0;
		
		for(int i = 1; i<prices.length; i++)
		{
			
			int loss = prices[i] - maxPriceSofar;
			
			maxLoss = Math.min(maxLoss, loss);
			
			maxPriceSofar = Math.max(maxPriceSofar, prices[i]);
		}
		
		
		return maxLoss;
		
		
		
	}

	public static void main(String[] args) {
		
		
		int[] prices = {100, 180, 260, 310, 40, 535, 695, 30};
		
		
		System.out.println("Max loss   : " + maxLoss(prices));
	}
}
