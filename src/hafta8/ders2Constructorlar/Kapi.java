package hafta8.ders2Constructorlar;

public class Kapi {
	 int kapiBoy=200;
	 int kapiGenislik=90;
	String kapiAcilisYonu="sağ";
	String kapiRengi="kahverengi";
	
	public void kapiAc() {
	if(kapiAcilisYonu.equals("sağ"))
		System.out.println("kapılar sağa açılır");
	else if(kapiAcilisYonu.equals("sol"))
		System.out.println("kapılar sola açılır");
	else System.out.println("hatalı kapı");
	}
	
	
}
