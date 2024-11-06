package in.chaithanya;

public class CreditCardPayment implements IPayment {

	public  CreditCardPayment() {
		System.out.println("CreditCardPayment :: constructor");
		
	}
	public String pay(double amount) {
		// logic for credit card payment
		return "Payment Successful through Credit Card";
	}

}
