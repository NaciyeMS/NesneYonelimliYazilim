package hafta7;

public class D9Varargs {

	public static void main(String[] args) {
		///Varargs (Değişken Sayıda Argümanlar)		
/*Java’da Varargs, bir metodun değişken sayıda argüman alabilmesini 
sağlayan bir özelliktir.İsmini “variable arguments” ifadesinden alır
 ve programcının, aynı türden birden fazla değeri tek parametreyle 
 göndermesine olanak tanır.

🔹 Varargs Kullanım Kuralları
Bir metotta yalnızca bir tane varargs kullanılabilir 
ve bu parametre her zaman en sonda yer almalıdır.
Aksi takdirde, Java hangi argümanların hangi parametreye
 ait olduğunu ayırt edemez. 
Örneğin:
toplama(int... a, int... b); // ❌ Geçersiz
toplama(int b, int... a);    // ✅ Geçerli


Varargs yapısı aslında bir dizi (array) gibi çalışır.
Yani Java, arka planda gönderilen tüm değerleri bir diziye
 dönüştürerek metoda aktarır.

Varargs parametresi, hem ilkel (primitive) türlerde 
hem de nesne (non-primitive) türlerde kullanılabilir.
Örneğin int..., String... veya double... şeklinde tanımlanabilir.

Aynı türde birden fazla argüman alınabilir.
Örneğin topla(2, 4, 6, 8) şeklinde çağrıldığında, 
tüm değerler int... parametresine gider.

Hiç argüman gönderilmeden de metot çağrılabilir.
Yani topla(); ifadesi geçerlidir ve 
varargs parametresi bu durumda boş bir dizi olarak çalışır.*/
		  System.out.println(topla(2, 4, 65, 90, 4, 2)); // Çok sayıda argüman
	      System.out.println(topla(2, 4, 7));            // Üç argüman
	      System.out.println(topla(5, 4));               // İki argüman
	}
	public static int topla(int... a) {
        int toplam = 0;
        for (int w : a) {
        	toplam += w;
        }
        return toplam;
    }
/*
 * 
 * Bir metotta yalnızca bir tane varargs ifadesi bulunabilir.
 * Varargs parametresi her zaman metottaki son parametre olmalıdır.
 Aksi halde, derleyici hangi verinin hangi parametreye ait olduğunu
 ayırt edemez.
 * Varargs yapısı arka planda bir dizi (array) olarak çalışır.
 * Varargs parametresi hem ilkel (primitive)
 hem de referans (non-primitive) türlerle tanımlanabilir.*/

}
