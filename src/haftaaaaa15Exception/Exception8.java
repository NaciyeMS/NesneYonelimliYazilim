package haftaaaaa15Exception;

public class Exception8 {

	public static void main(String[] args) {
		try {
			System.out.println(10/2);
		}catch (ArithmeticException e) {
			System.out.println("0 a bölme hatasırı");
		} 
		finally {
			System.out.println("fnally blogu her durumda çalışacak");
		}

	}
/*
 * finally bloğu, 
Java'da try-catch blokları ile birlikte kullanılan ve her durumda çalışacak olan
 bir kısımdır. 
finally bloğunun temel amacı, 
hata olsa da olmasa da her durumda çalıştırılması gereken kodları yerleştirmektir. 
Genellikle temizleme işlemleri 
(örneğin, açık kaynakların kapatılması veya dosya bağlantılarının kapatılması)
 için kullanılır. 
 
  Kaynakların serbest bırakılması :  (veritabani baglantisinin kesilmesi,
   close() methodu ile), 
   Özellikle eski Java versiyonlarında (Java 7 öncesi), 
   veritabanı bağlantıları gibi kaynaklar manuel olarak kapatılmalıydı. 
   Bu tür kaynaklar, uzun süre açık bırakılırsa sistemde gereksiz yere yer kaplar 
   ve potansiyel performans sorunlarına neden olabilir.
    Java 7 sonrasi otomatiklesti ( try-with-resources ifadesi ile) 
Dosyaların kapatılması :  (az once dosya bağlantısı yapmıştık.  
fis.close(); ile kapatılabilirdi) 
   Dosyaları okuma veya yazma işlemi bittikten sonra kapatmak gereklidir. 
   Aksi halde, dosya kolları gereksiz yere sistemde yer kaplar. 
   
 Her durumda çalıştırılması gereken temizleme işlemleri :
  (Bazı işlemler, başarılı olsun ya da olmasın, belirli bir
   sürecin sonunda her zaman yapılmalıdır.Örneğin,
    bir log dosyasına her işlemin başlangıç ve bitiş 
    zamanını kaydetmek gibi. BufferedWriter ile)
*/
}
