package hafta2;

import java.util.Scanner;

public class D3ScannerSinifi {

	public static void main(String[] args) {
		///SCANNER SINIFI
		/*Sınıflar paketlerin alt birimleridir.
		Java bir çok sınıftan meydana gelir
		Bu sınıflar çeşitli paketlerde toplanmıştır. 
		Paketler Java ya da Javax ön ekleri ile başlarlar. 
		Ön eki; Java olanlar Standart API ye bağlıdır. 
		   Javax olanlar sonradan ekleme sınıflardır.(extension)
		java.paketAdi.sinifAdi
		java.util.scanner;
		Bir sınıf kendi ile aynı pakette olmayan bir sınıfı kullanacaksa,
		Kendinden önce o sınıfı import etmeli.
		
		import paketAdi.sınıfAdi;
		import java.util;
		
		import paketAdi.sınıfAdi.*;  //* paketteki tüm sınıfları çağırır. 
		import java.util.*;

		 * */
			   
		        Scanner girdi = new Scanner(System.in);

		        System.out.println("Adınızı ve soyadınızı giriniz");
		        // nextLine() metodu birden fazla kelimeli giriş alabilir
		        String adSoyad = girdi.nextLine();

		        System.out.println("Yaşınızı giriniz");
		        byte yas = girdi.nextByte();

		        System.out.println("Boyunuzu giriniz");
		        float boy = girdi.nextFloat();

		        System.out.println("Kilonuzu giriniz");
		        short kilo = girdi.nextShort();

		        System.out.println("Medeni durumunuzu giriniz");
		        // next() metodu tek kelimeli String girişinde kullanılabilir
		        String medeniDurum = girdi.next();

		        // Kullanıcı bilgilerini ekrana yazdıralım
		        System.out.println("Ad Soyad = " + adSoyad);
		        System.out.println("Yaş = " + yas);
		        System.out.println("Boy = " + boy);
		        System.out.println("Kilo = " + kilo);
		        System.out.println("Medeni Durum = " + medeniDurum);

	}

}
