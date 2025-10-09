package hafta6;

import java.util.Arrays;

public class D6Diziler {

	public static void main(String[] args) {
		String [] gunler={"pazartesi","salı" ,"çarşamba", "Perşembe","Cuma", "cumartesi" ,"Pazar" };
		
		// dizi uzunluğunu bulmak için Diziİsmi.Lenght

		System.out.println(gunler.length);

		//geliştirilmiş for
		/*/gunler dizisindeki her bir elamanı sırası ile g değişkeni 
		 * içerisine alır ve onun üzerine işlem yapar*/
		for(String g: gunler) 
		{
		System.out.println(g);
		}
		
		//dizilerin sıralanması için 
		//Array kütüphanesi eklenir
		//import java.util.Arrays; kütüphanesi eklenmelidir
		 int[] sayilar = {25, 67, 12, 89, 45, 90, 34};
		Arrays.sort(sayilar);
		for(int g: sayilar) 
		{
		System.out.println(g);
		}
		
		//dizilerin kopyalanması
		//System.arraycopy(dizi1,başlangıç,dizi2, başlangıç,uzunluk);
		//Uzunluk kaç adet kopyalanacak 
		int[] dizi1 = {25, 67, 12, 89, 45, 90, 34};
		int[] dizi2 = new int[3]; // hedef dizinin boyutu en az 3 olmalı
		System.arraycopy(dizi1, 0, dizi2, 0, 3);
		for(int g: dizi2) {
		    System.out.println(g);
		}
		
		//diziler eşitmi kontrolü 
		System.out.println(Arrays.equals(dizi1, dizi2));
	}

}
