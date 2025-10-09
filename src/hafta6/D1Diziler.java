package hafta6;

import java.util.Arrays;

public class D1Diziler {

	public static void main(String[] args) {
		///DİZİLER
		//Aynı türden birden fazla veriyi, 
		//tek bir değişken adı altında saklamaya yarayan yapılardır.
		//Çok sayıda veriyi düzenli şekilde tutmak için.
		//Tek tek değişken tanımlama ihtiyacını ortadan kaldırır.
		//Dizinin boyutu sabittir (başta belirlenir).
        //Elemanlara indeks ile erişilir (0’dan başlar).
		//Avantajlar: Düzenli veri saklama, hızlı erişim.
		//Dezavantajlar: Boyutu sonradan değiştirilemez.
		//Dezavantajlar: Tek tip veri tipi alır içerisine
		
		//DİZİ TANIMLAMA 
		//Veritipi [ ] Diziİsmi =new VeriTipi[elemansayısı];
		//içi boş bir dizi tanımlaması
		String [] gunler=new String[7]; 
		//Dizi içerisi veri atama
		gunler[0]="pazartesi"; //0. indise atama 
		gunler[3]="Perşembe";//3. indise atama
		
		//dizi içindeki verileri kullanma
		System.out.println(gunler[3]);
		System.out.println("1. değer"+gunler[0]);
		
		//içi dolu bir dizi tanımlama
		//Veritipi [ ] Diziİsmi ={değerler virgül ile ayrılmış};
		String [] days={"pazartesi","" ,"çarşamba", "Perşembe","Cuma", "" ,"Pazar" };

		byte [] notlar= {15,89,5,0,6,0,52};
		System.out.println(notlar[5]);
		notlar[5]=78;//dizi içindeki değeri dğeiştirme
		
		//dizideki tüm değerleri yazdırma 
		//I. YOL
		System.out.println(notlar[0]);
		System.out.println(notlar[1]);
		System.out.println(notlar[2]);
		System.out.println(notlar[3]);
		System.out.println(notlar[4]);
		System.out.println(notlar[5]);
		System.out.println(notlar[6]);
		//II.YOL
		for(int i=0;i<7;i++) {
			System.out.println(notlar[i]);
			//i sayma işlemini yapacak zaten 
			//sırası il e bütün dizi elemanlarına erişecel
		}
		//III. YOL
		 Integer[] integers = new Integer[10];
	     System.out.println(Arrays.toString(integers));

	     
	     //Arraylerin esit olup olmadigi nasil anlasilir?
	        int[] a = new int[3];
	        a[0] = 2;
	        a[1] = 1;
	        a[2] = 3;

	        int[] b = new int[4];
	        b[0] = 2;
	        b[1] = 1;
	        b[2] = 3;
	        b[3]=5;

	        //iki arrayin ayni olabilmesi icin, ayni index te ayni elemanlarin bulunmasi gerekir
	        boolean result = Arrays.equals(a,b);
	        System.out.println("result = " + result); //result = true


	}

}
