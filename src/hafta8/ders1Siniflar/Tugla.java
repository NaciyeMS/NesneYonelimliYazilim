package hafta8.ders1Siniflar;

public class Tugla {
	//özelliikleri
	 int en=10;
	 int boy=5;
	 int yukseklik=10;
	//metodları 
	public  void hacim() {
		int hacim=en*boy*yukseklik;
		System.out.println("tuğlanın hacmi:"+hacim);
	}

}
/*sınıf tanımlamalarında main koduna ihtiyaç yoktur.
 * ama bu sınıfların çalıştırılması için başka bir sınıfta main kodu içinde çağrılmalıdır.
 * Gerçek projelerde bir çok class olur ama bir tane main fonksiyonun olduğu sınıf olur buna 
 * da genellikle Runner sınıfı derler. 
 * Bu yüzden EvRunner Adında bir sınıf oluşturduk. 
 * */





