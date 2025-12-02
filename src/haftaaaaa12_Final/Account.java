package haftaaaaa12_Final;

public class Account {
	//final tanımlanan metod OVERRIDE EDİLEMEZ
	public final void login() {
System.out.println("kullanıcı sisteme giriş yapıyor");
	}
	//final olmayan metod OVERRIDE EDİLEBİLİR
	public void displayAccountType() {
		System.out.println("hesap türü: genel hesap");
	}

}
