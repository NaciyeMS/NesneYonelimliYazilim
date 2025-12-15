package haftaaaaa12_Overriding;

public class DebitCardPayment extends Payment {
	@Override
	public void processPayment(double amount) {
		System.out.println("banka kartı ile ödeme gerçekleşiyor "+amount+"TL");
		System.out.println("bankada yeterli bakiye var mı kontrol ediliyor");
	}	
//banka kartı işlemleri için 	
}
