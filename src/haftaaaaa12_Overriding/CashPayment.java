package haftaaaaa12_Overriding;

public class CashPayment extends Payment{
	@Override
	public void processPayment(double amount) {
System.out.println("nakit ödeme gerçekleşiyor "+amount+"TL");
System.out.println("kasiyere nakit ödeme alındı bildiriliyor");
	}
		//nakit ödemeler için tanımlandı 
}
