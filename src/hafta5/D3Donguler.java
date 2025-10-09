package hafta5;

import java.util.Scanner;

public class D3Donguler {

	public static void main(String[] args) {
		/*Kullanıcıdan alınan metni ekrana 100 defa yazınız. 
		 * Başına da kaçıncı sayı olduğunu görsel şekilde yazdırınız.*/
		Scanner klavye=new Scanner(System.in);
		System.out.println("bir metin giriniz");
		String girilenMetin=klavye.nextLine();
		for (int i = 0; i < 100; i++) {
				System.out.println(i+"-"+girilenMetin);
		}

		/*Girilen sayını faktöriyelini alan programı yazınız.
		 */		
		System.out.println("bir sayı giriniz");
		int girilenSay=klavye.nextInt();
		int f=1;
		for (int i = 1; i <= girilenSay; i++) {
				f*=i;
		}
		/*Kullanıcıya kaç tane sayı gireceğini soruyor.(n tane) 
		 * Kullanıcının bu sayıları girmesi sağlanıyor. 
		 * Girilen bu sayılar toplanıyor. Sonuç ekrana 
		 * yazılıyor. */
		System.out.println("bir sayı giriniz");
		int n=klavye.nextInt();
		int t=1;
		for (int i = 1; i <= n; i++) {
			System.out.println(i+". sayıyı giriniz");
			int gSayi=klavye.nextInt();
			t=t+gSayi;
		}
		System.out.println("Girilen sayıların Toplamı:"+t);
		/*Çarpım tablosunu oluşturan programı yazınız
		 */
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			
		}
		/*Aşağıdaki sayı sistemini ekrana yazdıran bir program yazınız. 
		11 		23 		41 		53 
		12		24 		42 		54 
		13 		31 		43 
		14 		32 		44 
		21 		33 		51 
		22 		34 		52 
*/
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.println(i+""+j);
			}
			
		}
		
	}

}
