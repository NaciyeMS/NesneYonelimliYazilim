package hafta5;

import java.util.Iterator;

public class D1Donguler {

	public static void main(String[] args) {
		/*Bir öğrenci ders sırasında kâğıttan yaptığı 
		 * uçağıyla oynamaya başlar. Hocası durumu fark eder ve kızar:
		 * “Ceza olarak tahtaya 1000 defa 
		 * ‘Yere çöp atmayacağım’ yazacaksın!” der.
		 * Ama öğrencimiz bir programcıdır 😊 
		 * Bilgisayar dilini bildiği için 1000 kez yazmak yerine, 
		 * sadece 2 satırlık bir program yazarak 
		 * cezasını hemen bitirir.:)*/
		/*DÖNGÜLER
		 * Bir başlangıç
		 * bir bitiş
		 * sabit bir artış 
		 * tekrar eden bir iş */
		
		/*Ekrana 1 Den 5 a kadar "yere çöp atmayacağım" yazdırın
		 * 						i
		 * Bir başlangıç		1
		 * bir bitiş			5
		 * sabit bir artış		+1 
		 * tekrar eden bir iş 	
		 * ekrana yaz "yere çöp atmayacağım" */
		System.out.println("yere çöp atmayacağım");//1. başlangıç
		System.out.println("yere çöp atmayacağım");//2.
		System.out.println("yere çöp atmayacağım");//3.
		System.out.println("yere çöp atmayacağım");//4.
		System.out.println("yere çöp atmayacağım");//5. bitiş 
		
		  //başlangıç	bitiş kontrol	sabit artış 
		for(int i=1;	i<5;			i++) {
			System.out.println("yere çöp atmayacağım");//tekrar eden iş 
		}
		
		//5 satır yerine 2 satırda bu kodu yazdık
		/*Peki 1000 defa yazdırmak isteseydik*/
		for(int i=1;	i<1000;			i++) {
			System.out.println("yere çöp atmayacağım");//tekrar eden iş 
		}
		
		/*kaçıncı yazı olduğunu yanına da yazdırmak isteseydik*/
		for(int i=1;	i<1000;			i++) {
			System.out.println(i+". yere çöp atmayacağım");
			//i zaten sayma işini yaptığı için 
			//i yi ekrana yazdırmamız yeterli 
		}
	}

}
