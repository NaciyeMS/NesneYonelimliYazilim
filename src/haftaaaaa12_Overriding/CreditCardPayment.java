package haftaaaaa12_Overriding;

public class CreditCardPayment extends Payment{
	@Override
	public void processPayment(double amount) {
System.out.println("kredi kartı ile ödeme gerçekleşiyor: "
				+amount+"TL");
System.out.println("kredi doğrulama işlemleri yapılıyor");
	}	
 //kredi kartı ile ilgili işlemler için 
	
}