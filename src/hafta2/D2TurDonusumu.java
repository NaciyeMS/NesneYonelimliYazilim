package hafta2;

public class D2TurDonusumu {

	public static void main(String[] args) {
		/*
		 * Primitive data tiplerinin birbirine dönüştürülmesine denir.
		Bazı durumlarda elimizdeki veri tipi işimize yaramaz ve onu ihtiyacımız olan veri tipine dönüştürmek zorunda kalırız.
		Bu işlemi yapmak için tür dönüşümü yapmak zorundayız. 
		Veri_tipi degisken=(Veri_tipi)dönüşecek_veri;
		*/
		byte a=45;
		int b;
		b=a;      //bilinçsiz tür dönüşümü 
		b=(int)a; //bilinçli tür dönüşümü 
		
		//Küçük kaptaki veriyi büyük kaba döksek neler olabilir? 
		//AUTOWIDENING
		//sıkıntı çıkmaz veriler aktarılır. 
		//hata mesajı bile almayız
		
		
		byte y;
		int x=15;
		//y=x;//hata alındı
		y=(byte)x;
		System.out.println(y);
		//veri kaybı yok 
		
		byte n;
		int m=3152;
		n=(byte)m;
		System.out.println(n);
		//veri kaybı var
		
		/*
		 * Büyük kaptaki veriyi küçük kaba döksek neler olabilir?  
		 //EXPILICIT NARROWING
		 //Veri kaybı olabilir
		 ///Büyük data type’ larini küçük data type’ larina çevirmek
		 /// riskli bir iştir. Veri kaybı oluşabilir.
		 ///Java bu işi otomatik olarak yapmaz.
		 /// Bu işlemi kod yazanlar yapar.
		  */
		/*
		 *  
		 *  1- Daha Büyük Bir Veri Türünden Daha Küçüğe Geçiş:		Örneğin, double bir sayıyı int’e çevirmek istediğinizde.		Bu tarz dönüşümlerde çoğu zaman veri kaybı riski vardır.
		 *  2- Farklı Türler Arasında Uyum Sağlama:      Çeşitli tipteki değişkenleri veya nesneleri birlikte kullanmak gerektiğinde dönüşüm gerekebilir.
		 *  3- Nesne Yönelimli Programlamada (OOP) Kalıtım İlişkileri:       Bir alt sınıf (child) nesnesini üst sınıf (parent) tipine dönüştürmek       ya da bunun tersini yapmak tip dönüşümüne örnektir.
		 *  4- API ve Kütüphane Kullanımlarında:       Bazı hazır metodlar sadece belirli türleri kabul eder.       Örneğin, int parametre bekleyen bir metoda float değer göndermek için dönüşüm yapılmalıdır.
		 *  5- Sayısal İşlemlerde:       Birden fazla farklı veri türünü aynı matematiksel işlemde kullanmak istediğinizde, tip dönüşümü devreye girer.

		 * */
		
		///SAYISAL VERİLERİ STRİNG E ÇEVİRME
		String xString="123";
		int xInteger=Integer.parseInt(xString);
		System.out.println(xInteger-3);
		
		int yInteger=Integer.valueOf(xString);
		System.out.println(y);
		
		
		/*
		 * 
		Veri_tipi degisken=veri_tipi.valueOf(string_deger);
		
		Veri_tipi degisken=veri_tipi.parseveri_tipi(string_deger);
		
		*/
		
	}

}
