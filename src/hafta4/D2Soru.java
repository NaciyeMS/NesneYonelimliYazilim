package hafta4;

import java.util.Scanner;

public class D2Soru {

	public static void main(String[] args) {
		/*Kurallar:
		Şifre en az 8 karakter uzunluğunda olmalıdır.
		Şifre boşluk karakteri içermemelidir.
		Şifre en az bir büyük harf içermelidir.
		Şifre en az bir küçük harf içermelidir.
		Şifre en az bir rakam içermelidir.
		Şifre en az bir sembol (noktalama işareti veya özel karakter) içermelidir.
		Program, kullanıcıya hangi kural(lar)ı sağlamadığını ekrana yazmalı; eğer tüm kurallar sağlanıyorsa "Şifre geçerli" mesajı vermelidir.
		*/
		 Scanner klavye = new Scanner(System.in);
	     System.out.print("Şifrenizi giriniz: ");
	     String sifre = klavye.nextLine();

	        // i) Uzunluk en az 8 karakter olmalı
	        boolean uzunlukKontrol = sifre.length() >= 8;
	        // ii) Boşluk olmamalı
	        boolean boslukKontrol = !sifre.contains(" ");
	        // iii) En az bir büyük harf olmalı
	        boolean buyukHarfKontrol = sifre.replaceAll("[^A-Z]", "").length() > 0;
	        // iv) En az bir küçük harf olmalı
	        boolean kucukHarfKontrol = sifre.replaceAll("[^a-z]", "").length() > 0;
	        // v) En az bir rakam olmalı
	        boolean rakamKontrol = sifre.replaceAll("[^0-9]", "").length() > 0;
	        // vi) En az bir sembol olmalı
	        boolean sembolKontrol = sifre.replaceAll("[^\\p{Punct}]", "").length() > 0;
	        // Kullanıcıya eksik olan kısımları bildir
	        if (!uzunlukKontrol) {
	            System.out.println("Şifre en az 8 karakter olmalıdır.");}
	        if (!boslukKontrol) {
	            System.out.println("Şifre boşluk içermemelidir.");}
	        if (!buyukHarfKontrol) {
	            System.out.println("Şifre en az bir büyük harf içermelidir.");}
	        if (!kucukHarfKontrol) {
	            System.out.println("Şifre en az bir küçük harf içermelidir.");}
	        if (!rakamKontrol) {
	            System.out.println("Şifre en az bir rakam içermelidir.");}
	        if (!sembolKontrol) {
	            System.out.println("Şifre en az bir sembol içermelidir.");}

	        // Tüm koşullar sağlanıyorsa geçerli şifre
	        boolean gecerliMi = uzunlukKontrol && boslukKontrol && buyukHarfKontrol &&
	                            kucukHarfKontrol && rakamKontrol && sembolKontrol;

	        if (gecerliMi) {System.out.println("✅ Şifre geçerli.");}
	        else {   System.out.println("❌ Şifre geçerli değil."); }

	}

}
