package hafta5;

import java.util.Scanner;

public class D6Soru {

	public static void main(String[] args) {
		/*Kullanıcıdan 5 girinceye kadar sayı isteyin. 
Kullanıcı 5 girdiğinde bu sayıların toplamını ekrana yazdırın.
*/
		 int sayi=0,toplam=0,sayac=0;
	       Scanner tara= new Scanner(System.in);
	       do{
	       System.out.println("sayı girin");
	       sayi=tara.nextInt();
	       toplam=toplam+sayi;
	       sayac++;
	       }while(sayi!=5);
	       System.out.println("Sayıların ortalamsı"+toplam/(sayac-1));
	      
	       
	       //edfh
	       System.out.println("sayı girin");
	       sayi=tara.nextInt();
	       while(sayi!=5)
	       {
	        toplam=toplam+sayi;
	        sayac++;
	        System.out.println("sayı girin");
	        sayi=tara.nextInt();        
	       }
	        System.out.println("Sayıların ortalamsı"+toplam/sayac);
	        }


	}

