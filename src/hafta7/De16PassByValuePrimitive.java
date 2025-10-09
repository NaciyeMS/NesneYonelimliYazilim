package hafta7;

public class De16PassByValuePrimitive {
	///PASS BY VALUE
	/////primitive tiplerde 
/* Metotlara parametre olarak verilen değişkenlerin kopyalarının alınarak
 *  işlenmesi anlamına gelir. 

Yani, metot içinde yapılan değişiklikler orijinal değişkeni etkilemez,
 sadece kopya üzerinde yapılır. Java'da her şey pass by value ile aktarılır, 
 ancak referans türleri için bu durum biraz kafa karıştırıcı olabilir.
*/
	public static void main(String[] args) {
		int d=3;
		degistir(d);
		System.out.println(d);
	}
	private static void degistir(int d) {
		d=4;
		
	}
/*Bu kod primitive tipler ve değer iletimi (pass by value) 
 *  Adım adım açıklayalım:
 *  main metodunda int d = 3; ile bir tam sayı değişkeni oluşturuluyor.
 *  degistir(d); çağrısı ile d değişkeni metoda gönderiliyor.
 *  degistir metodunda d = 4; ile metodun kendi içindeki kopyası değiştirilmiş
 oluyor.
 *   Ancak int gibi primitive tipler Java’da değer ile gönderildiği için,
 metod içinde yapılan değişiklik ana değişkeni etkilemez.
 *   Bu nedenle System.out.println(d); çıktısı hâlâ 3 olur.


"Primitive tipler metoda gönderildiğinde, yalnızca bir kopyası ile çalışılır.
 Metod içindeki değişiklikler orijinal değişkeni etkilemez."*/

}
