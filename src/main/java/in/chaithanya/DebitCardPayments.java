package in.chaithanya;

public class DebitCardPayments implements IPayment{
	
	public DebitCardPayments() {
		System.out.println("DebitCardPayments :: Constructor");
	}
	public String pay(double amount) {
		// logic for debit card payment
		return "Payment Successful through Debit Card";
	}


}
