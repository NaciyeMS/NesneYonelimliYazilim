package haftaaaaa14_Exception;

public class KonuOzetSinifi {
	
	public static void main(String[] args) {
		//System.out.pintln();
		//compile error
		//run time erro
		System.out.println(4/0);
	}
	
///EXCEPTIONS
/*Exeptions(İSTİSNALAR)Nedir?
Exception, Java'da hataları temsil eden bir sınıftır. 
İçerisinde hata kodları, bilgi mesajları ve ilgili metotlar bulunur
Programın çalışma zamanında (runtime) karşılaşabileceği hataları ele alır.
Bu hatalarla başa çıkmak için kullanılan bir mekanizmadır
 Exceptions, kodunuzun beklenmedik durumlarla daha güvenli ve düzenli bir şekilde 
 başa çıkmasını sağlar.
 *
 Bir exception, programın normal akışını bozan olağan dışı bir durumdur. 
 Java'da bu durumlar Exception sınıfından türeyen nesnelerle temsil edilir.

Örneğin:
Bir dizinin sınırını aşmaya çalışmak (ArrayIndexOutOfBoundsException)
Bir sayıyı sıfıra bölmek (ArithmeticException)
Geçersiz bir dosya yolu açmaya çalışmak (FileNotFoundException)

///Kod Çalışma Süreci:
Bir sınıfta tanımlanan bir metot çağrıldığında kod çalışmaya başlar.
Kod satır satır okunurken bir hata oluşursa, bir exception durumu meydana gelir.
///Öngörülebilir ve Öngörülemeyen Hatalar:
Geliştiriciler, bilinen hata durumlarını önceden öngörerek kodlarını bu hataları ele alacak şekilde düzenlemelidir.
Ancak, kullanıcılar programı kullanırken her zaman beklenmeyen durumlar oluşabilir.
Bir exception meydana geldiğinde, kodun yürütülmesi kesintiye uğrar ve hata bilgileri genellikle log dosyalarına kaydedilir.
///Exception Handling (Hata Yönetimi):
Hata oluştuğunda, sebebini tespit etmek ve çözüm üretmek gerekir.
Hata o an çözülemiyorsa bile, sistemin çökmesini önlemek ve çalışmaya devam etmesini sağlamak için alternatif çözümler geliştirilmelidir.(kesinti olmadan)
///Exception Yönetiminin Amacı:
Sistemin güvenilirliğini artırmak.
Kullanıcı deneyimini iyileştirmek.
Programın beklenmedik durumlara karşı dayanıklı olmasını sağlamak.

 * 
 * 
 * Kodun beklenildiği gibi çalışmaması durumunda, kullanıcı deneyiminin aksamaması 
 * için işlemleri bir try-catch bloğunda ele almak yaygın bir yaklaşımdır.
Bu yöntem, hataların kontrol altına alınmasını ve programın çökmesini önlemeyi amaçlar.
Ancak, tüm kodları rastgele try-catch bloklarına sarmak doğru bir yöntem değildir.
Gereksiz try-catch kullanımı, hataların maskelenmesine ve gerçek sorunların 
gizlenmesine neden olabilir.
try-catch blokları, yalnızca belirli ve anlamlı hata senaryoları için dikkatli 
bir şekilde kullanılmalıdır.

*/
	///Java Exception Sınıf Hiyerarşisi (Inheritance Tree)
	/*java.lang.Object
   └── java.lang.Throwable
        ├── java.lang.Error
        │     ├── OutOfMemoryError
        │     ├── StackOverflowError
        │     └── ... (diğer ciddi sistem hataları)
        │
        └── java.lang.Exception
              ├── Checked Exceptions
              │     ├── IOException
              │     │     └── FileNotFoundException
              │     ├── SQLException
              │     └── ... 
              │
              └── Unchecked Exceptions (RuntimeException)
                    ├── ArithmeticException
                    ├── NullPointerException
                    ├── ArrayIndexOutOfBoundsException
                    └── ... 
*/
	
////	================================================================================
////	                           JAVA EXCEPTION TÜRLERİ ÖZETİ
////	================================================================================
			/*
	1) CHECKED EXCEPTIONS (Derleme Zamanı Hataları)
	--------------------------------------------------------------------------------
	- Bu istisnalar derleme (compile) aşamasında kontrol edilir.
	- Programcı bu tür hataları zorunlu olarak ele almak zorundadır.
	- try–catch bloğu kullanılmalı veya metod imzasına 'throws' anahtar kelimesi
	  eklenmelidir.
	- Genellikle dosya işlemleri, veri tabanı erişimi gibi dış kaynaklarla ilgili
	  durumlarda ortaya çıkar.

	Örnekler:
	  • IOException
	  • FileNotFoundException
	  • SQLException


	2) UNCHECKED EXCEPTIONS (Runtime Hataları)
	--------------------------------------------------------------------------------
	- Derleme aşamasında kontrol edilmez, program çalışırken oluşur.
	- Genellikle programlama hatalarından kaynaklanır (yanlış indeks, null değer vb).
	- try–catch zorunlu değildir, programcıya bırakılır.
	- En sık karşılaşılan exception grubudur.

	Örnekler:
	  • ArithmeticException       (0’a bölme)
	  • NullPointerException      (null referansa erişim)
	  • ArrayIndexOutOfBoundsException (Dizi sınırlarını aşma)


	3) ERRORS
	--------------------------------------------------------------------------------
	- Exception sınıfından değil, Error sınıfından türetilir.
	- Uygulamanın kontrol edemeyeceği ciddi sistem hatalarını temsil eder.
	- Genellikle JVM seviyesinde meydana gelir.
	- try–catch ile yakalanması önerilmez; programın kendisi bu hataları
	  toparlayamaz.

	Örnekler:
	  • StackOverflowError
	  • OutOfMemoryError

	================================================================================
	*/

}
