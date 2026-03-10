package AbstractionVSInterface;

abstract class Payment {

	abstract void processPayment(double amount); // abstract method

	void paymentStatus() // concrete method
	{
		System.out.println("Payment initiated...");
	}

}

  class CreditCardPayment extends Payment {

	void processPayment(double amount) {

		System.out.println("Processing Credit Card payment :" + amount);
	}

}


class UpiPayment extends Payment
{
	void processPayment(double amount)
	{
		System.out.println("Processing UPI Payment :" + amount);
	}
	}


 class Main {
	public static void main(String[] args) {
		Payment p1 = new CreditCardPayment();
		p1.paymentStatus();
		p1.processPayment(5000);
		
		Payment p2 = new UpiPayment();
		p2.processPayment(1000);
	}
}





























