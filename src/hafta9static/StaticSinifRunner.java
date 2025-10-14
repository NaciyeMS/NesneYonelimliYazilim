package hafta9static;	
////STATIC
/*
🔹 static anahtar kelimesi, bir değişkenin veya metodun 
doğrudan sınıfa ait olduğunu belirtir.
🔹 static olarak tanımlanan öğelere sınıfın bir örneği 
(nesnesi) oluşturulmadan erişilebilir.
🔹 Yani static class member’lara (değişken veya metotlara) 
ulaşmak için obje oluşturmak gerekmez.
🔹 Buna karşılık, non-static (örnek seviyesindeki) class 
member’lara erişmek için obje oluşturmak zorunludur.
 */
public class StaticSinifRunner {
	public static void main(String[] args) {	
		StaticSinif nesne=new StaticSinif();
		//staticMetod ve nonStaticMetod nesne üzerinden çağrılabilir
		nesne.nonStaticMetod();		
		nesne.staticMetod();
		//Sadece staticMetod lar sınıf üzerinden çağrılabilir
		StaticSinif.staticMetod();
		
		StaticSinif s1=new StaticSinif();
		s1.disFircasi=1;
		
		StaticSinif s2=new StaticSinif();
		s2.disFircasi=5;
		
		System.out.println(s1.disFircasi);
		System.out.println(s2.disFircasi);
		/*Non static verilerin her birini nesnenin kendine özeldir. 
		S1 nesnesinin disFircası ile 
		S2 nesnesinin disFircasi birbirinden farklıdır. 
		*/
		
		StaticSinif s4=new StaticSinif();
		s4.buzDolabı=1;
		
		StaticSinif s3=new StaticSinif();
		s3.buzDolabı=5;
		
		System.out.println(s4.buzDolabı);
		System.out.println(s3.buzDolabı);
		System.out.println(s2.buzDolabı);
		System.out.println(s1.buzDolabı);
		/*static veriler her nesne için ortaktır. 
		 * Birinde yapılan değişiklik diğerinde de yapılmış sayılır. 
Yukarıdaki örnekte static(ortak) olan buzDolabi değişkenine
default olarak sınıfı tanımlarken 100 demiştik.
S4 nesnesi 1 i atadı
S3 nesnesi de son olarak 5 i atadı 
Son değişikliği s3 nesnesi yaptığı için 
s1-s2-s3-s4 tüm nesnelerin buzdolabı nesnesi 5 olarak değişti. 
*/
		
	}

}
/*		1) static variable veya static methodlar (class member) tüm object’ler için ortak elemandır
		2) static class member’lar üzerinde yapılan değişiklikler tüm objectleri etkiler.
		*static class member’lar class’a, 
		*non-static class member’lar object’lere aittir
		static variable= class variable
		non-static variable= instance variable 						= object variable

*/