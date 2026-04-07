package Wisson;

public class Exception_Try_Catch {

	public static void main(String[] args) {
		try {
			int a = 10 /0;
		} catch (Exception e) {
			
			throw  new RuntimeException ("Exception from catch");
			
			// TODO: handle exception
		}
	}
}
