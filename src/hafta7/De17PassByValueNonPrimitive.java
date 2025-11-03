package hafta7;

public class De17PassByValueNonPrimitive {
	/// PASS BY VALUE
////Non-primitive tiplerde
/* Metotlara parametre olarak verilen referansların kopyaları metoda iletilir.
* Yani, metodun içinde referansın işaret ettiği 
* **nesnenin içeriği değiştirilebilir**, 
* ancak referansın kendisi değiştirilirse orijinal nesneye etkisi olmaz.
* Java'da her şey pass by value ile aktarılır, ancak referans tipler için bu, 
* metod içinde nesnenin içeriği üzerinde değişiklik yapılabileceği 
* anlamına gelir.
* 
* Kısaca özetlersek:
Primitive tipler: Değerin kopyası değişir, orijinal değişmez.
Referans tipler: Nesnenin içeriği değiştirilebilir, 
                 ama referansın kendisi değişirse orijinal referans etkilenmez.
*/
	public static void main(String[] args) {
		int []dizi= {8,89,6};
		System.out.println(dizi[0]); //8
		System.out.println(dizi[1]);//89
		System.out.println(dizi[2]);//6
		degistir(dizi);
		System.out.println(dizi[0]);//1453
		System.out.println(dizi[1]);//0
		System.out.println(dizi[2]);//6
	}
	private static void degistir(int[] arr) {//non primitive
		arr[0]=1453;
		arr[1]=0;
			}
	private static void degistir(int d) {
		d=4;
		
	}
/*Diziyi metoda gönderme ->degistir(dizi);
degistir(int[] arr) metodu çağrılıyor.Referansın bir kopyası metoda gidiyor,
 ama bu kopya hâlâ orijinal diziyi gösteriyor.

Metod içinde:
arr[0] = 1453;
arr[1] = 0;
Dizinin 0. ve 1. elemanları değiştirilmiş oluyor.
Çünkü metod içindeki referans aynı diziyi işaret ediyor.*/
}
