package haftaaaaa12_Overriding;

import hafta8.ders4SiniflardaPassByValue.NewClass;

public class PaymentRunner {

	public static void main(String[] args) {
		Payment p1=new Payment();
		CreditCardPayment p2= new CreditCardPayment();
		p2.processPayment(455);
		DebitCardPayment p3=new DebitCardPayment();
		p3.processPayment(85);
		CashPayment p4= new CashPayment();
		p4.processPayment(566);
	}

}
