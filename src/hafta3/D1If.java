package hafta3;

public class D1If {

	public static void main(String[] args) {
		///KARŞILAŞTIRMA OPERATÖRLERİ
		/*Karşılaştırma için iki veriye ihtiyaç duyulur
		Her bir karşılaştırma durumdur
		Bir durumun karşılaştırma sonucu 	ya doğru 	ya yanlış bilgisi döner.
		== EŞİTMİ
		!= EŞİT DEĞİL Mİ?
		<  KÜÇÜK MÜ?
		>  BÜYÜK MÜ?
		<= KÜÇÜK VEYA EŞİT Mİ?
		>= BÜYÜK VEYA EŞİT Mİ?
		 */
		//System.out.println(7>5);
		
		///İF YAPISI 
		//Durum a>5 bir durumdur
		//Durum true dönerse yapılacakların çalışacağı kısımdır. 
		int a=7;
		if(a>5) 
		{
			//true döndüğünde çalışan scope alanı
			System.out.println("doğru");
		}
		///İF ELSE YAPISI 
		//Durum->Doğru ise yapılacaklar
	    //     ->Yanlış ise yapılacaklar 
		a=1;
		if(a>5) 
		{
			//true döndüğünde çalışan scope alanı
			System.out.println("doğru");
		}
		else 
		{
			//false döndüğünde çalışan scope alanı
			System.out.println("yanlış");
		}
		///ELSE İF  YAPISI 
				//Durum->Doğru ise yapılacaklar
			    //     ->Yanlış ise Durum2-> Doğru ise yapılacaklar
				//						  -> Yanlış ise....	
		        a=5;
				if(a>5) 
				{
					//true döndüğünde çalışan scope alanı
					System.out.println("5 den büyük");
				}
				else if(a<5)
				{
					//true döndüğünde çalışan scope alanı
					System.out.println("5 den küçük");
				}
				else {
					System.out.println("5 e eşit");
				}
	}

}
