package in.chaithanya;

public class UpiPayments implements IPayment {

	public UpiPayments() {
		System.out.println("UpiPayments :: Constructor");
	}
	public String pay(double amount) {
		// logic for upi payments
		return "Payment Successful through Upi Payments";
	}

}
