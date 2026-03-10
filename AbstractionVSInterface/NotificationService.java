package AbstractionVSInterface;

interface NotificationService {

	void sendNotification(String message);

}

class EmailService implements NotificationService {

	public void sendNotification(String message) {
		System.out.println("Sending Email  : " + message);
	}
}

class SmsService implements NotificationService {

	@Override
	public void sendNotification(String message) {
		System.out.println("Sending SMS  : " + message);

	}
}

  class InterfaceMain {
	 
	 public static void main(String[] args) {
		NotificationService n1 = new EmailService();
		n1.sendNotification("Order Placed");
		
		NotificationService n2 = new SmsService();
		n2.sendNotification("Payment Successful");
	}
 }