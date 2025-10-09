package hafta1;

public class D3DegiskenTanimlama2 {

	public static void main(String[] args) {
		// byte 0 den + 255’e tamsayı değerleri için kullanılır
		 byte ogrenciYas=15;
	        System.out.println(ogrenciYas);
	     // short -32768 den + 32767’e tamsayı değerleri için kullanılır
	     short siteNufusu=1200;
	        System.out.println(siteNufusu);
	     // int -2,147,483,648 ile 2,147,483,647’e
	     int sehirNufusu=84234657;
	     System.out.println(sehirNufusu);
	     // long -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807
	     //Bir sayıyı long tipinde tanımlarken sonuna
	     //mutlaka "L" harfi eklemelisiniz, 
	     //aksi halde "Integer number too large" 
	     //(Tam sayı çok büyük) hatası alırsınız.
	     long hucreSayisi=123456789012L;
	     System.out.println(hucreSayisi);  
	     
	     /*float ondalıklı sayılar için 
		 -> Java ondalıklı sayıları otomatik olarak double kabul eder.  
		  Bu yüzden varsayılan (default) tip double’dır.  
		  Eğer float olmasını istiyorsanız, sayının sonuna "F" veya "f" koymalısınız.*/
	     float tisortFiyat = 25.99f;
	        System.out.println("Fİyat: "+ tisortFiyat);
	     double cellWeight = 0.00000000000000000028;
	        System.out.println(cellWeight); 
	        //2.8E-19 ==> 2.8 çarpı 10 üzeri -19 demektir
	    	}

}
