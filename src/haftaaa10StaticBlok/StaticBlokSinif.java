package haftaaa10StaticBlok;
/*⚙️ Static Block (Statik Blok)
🔹 Tanım:

Static block, bir sınıf belleğe yüklendiği anda otomatik 
olarak çalışan bir kod bloğudur.Genellikle sınıfın başlangıç
 ayarlarını yapmak veya ilk değerleri tanımlamak için kullanılır.

🔹 Özellikleri:

Yalnızca bir kez çalışır:
Sınıf belleğe ilk yüklendiğinde static block devreye
 girer ve sadece bir defa çalıştırılır.

Başlangıç işlemlerinde kullanılır:
Programın çalışmaya başlaması için gerekli ayarları yapmak,
 sabit değerleri belirlemek veya sınıf genelinde 
 kullanılacak değişkenleri hazırlamak için tercih edilir.

Yerel değişken tanımlanamaz:
Static block içinde yerel değişken (local variable) tanımlanmaz,
 ancak sınıf düzeyindeki (static) değişkenlere değer ataması yapılabilir.

Performans etkisi:
Static block çalışırken programın açılış süresi biraz uzayabilir;
 ancak bu sayede sonraki işlemler daha hızlı gerçekleşir.

Dikkat edilmesi gereken durum:
Static block içinde yapılan hatalar, programın genel akışını
 etkileyebilir ve beklenmedik sonuçlara yol açabilir.*/
public class StaticBlokSinif {
	static double pi;
	static {
		pi=3.14;
		System.out.println("static blok çalıştı");
	}
	public StaticBlokSinif() {
		System.out.println("constructor çalıştı");
	}
	
	
}
