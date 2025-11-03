package haftaaa10InstanceBlok;
/*🧩 Instance Block (Örnek Blok)
🔹 Tanım:
Her constructorda tekrar eden bir kodunuz var. 
Her nesne oluşturulduğunda çalıştırılsın istiyorsunuz.

Bir class’tan her yeni nesne (object) oluşturulduğunda 
otomatik olarak çalışan kod bloğuna instance block (örnek blok) denir.

🔹 Özellikleri:

Her nesne oluşturulduğunda çalışır:
Bir sınıftan her yeni nesne üretildiğinde instance block 
devreye girer ve içindeki kodlar çalıştırılır.

Yani, her object oluşturulduğunda bu blok yeniden çalışır.

Kod tekrarını önler:
Nesne oluşturulurken yapılması gereken başlatma işlemlerini
 tek bir yerde tanımlamayı sağlar.

Böylece her constructor içinde aynı kodları tekrar yazmaya gerek kalmaz.

🔹 Not:

Instance block’lar, constructor’lardan önce çalışır.
Bir sınıfta birden fazla instance block bulunabilir.
Kodun okunabilirliğini artırmak ve ortak işlemleri tek
 bir yerde toplamak için kullanılır.*/
public class InstanceBlokClass {
	int year;
	//burası instance blok 
	{
		System.out.println("instance blok çalıştı");
		//aşağıda constructorlarda tekrar eden kodları silip 
		//instance bloğa yerleştirdik.
	}

	public InstanceBlokClass(int year) {
		//System.out.println("instance blok çalıştı");
		this.year = year;
		System.out.println(year);
	}

	public InstanceBlokClass() {
		//System.out.println("instance blok çalıştı");
		System.out.println("instance blok sonrası çalıştı");
	
	}
	
	
	
	
}
