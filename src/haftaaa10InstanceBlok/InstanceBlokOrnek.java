package haftaaa10InstanceBlok;
/*Örnek 3: Bir araba fabrikasında her araba siyah renkli ve yakıt tipi benzin olsun.
Hız, sunroof//(Bunlar ortak özellikler. Diğerleri sonra ayarlansın)
//1. contructor hiç parametre almasın. Arabaya ait bilgileri ekrana yazdırsın
//2. contructor 2 parametre alsın. Bilgileri ekrana yazdırsın.
*/
public class InstanceBlokOrnek {
int hiz=10;
String yakitTipi;
boolean sunRoof=true;
String renk;
	{
		yakitTipi="benzin";
		renk="siyah";
	}
	public InstanceBlokOrnek(int hiz, boolean sunRoof) {
		
		this.hiz = hiz;
		this.sunRoof = sunRoof;
	}
	public InstanceBlokOrnek() {
		
	}
	
	public static void main(String[] args) {
		InstanceBlokOrnek o1= new InstanceBlokOrnek();
	}
	
}
