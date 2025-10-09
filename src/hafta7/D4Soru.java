package hafta7;

import java.util.Scanner;

public class D4Soru {

	public static void main(String[] args) {
		/*Klavyeden girilen sayının karesini alan programı fonksiyon
		 *  ile tasarlayın.*/
		sayiAl();
	}
	public static void sayiAl() {
		Scanner klavye=new Scanner(System.in);
		System.out.println("Karesi alınacak sayıyı giriniz");
		int sayi=klavye.nextInt();
		System.out.println("Girdiğiniz sayının karesi"+kareAl(sayi));
	}
	private static int kareAl(int sayi) {		
		return sayi*sayi;
	}

}
