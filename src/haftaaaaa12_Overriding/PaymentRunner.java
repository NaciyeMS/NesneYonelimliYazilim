package haftaaaaa12_Overriding;

public class PaymentRunner {

	public static void main(String[] args) {
		
		Payment p5= new CashPayment();
		p5.processPayment(52);
	}

}
