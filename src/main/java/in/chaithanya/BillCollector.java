package in.chaithanya;

public class BillCollector {
	
	//public IPayment payment;
	private IPayment payment;  //field injection
	
	public void setPayment(IPayment payment) { // setter injection
		System.out.println("setPayment() :: executed");
		this.payment=payment;
	}
	
	
	public  BillCollector(IPayment payment) { // constructor injection
		System.out.println("BillCollector :: Param Constructor");
		this.payment=payment;
	}
	
	public void collectPayment(double amount) {
	System.out.println("Injected :: "+payment.getClass().getName());
		 String status=payment.pay(amount);
		 System.out.println(status);
		
	}
		
	

}
