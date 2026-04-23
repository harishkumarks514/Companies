package LTM;

public class FactorialExample {

	public static int factorial(int n)
	{
		if(n==0 || n ==1)
		{
			return 1;
		}
		// Recursive step : n! = n * (n - 1 )!
		return n * factorial(n -1);
	}
	
	public static void main(String[] args) {
		int number = 0;
		int result = factorial(number);
		System.out.println("Factorial of " + number + " is " + result);
	}
}
