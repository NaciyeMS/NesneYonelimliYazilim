package hafta7;

public class D7Polymorphism {

	public static void main(String[] args) {
		topla(2, 5.8);
/**/
	}
	public static void topla(int a, int b)        {  System.out.println(a+b);    }
	public static void topla(int a, int b, int c) {  System.out.println(a+b+c);}
	public static void topla(double a, double b)  {  
		System.out.println("bu çalışttı");System.out.println(a+b);    }
	public static void topla(double a, int b)     {  System.out.println(a+b);    }
/*Çağrı yapılan satır:

topla(2, 5.8);

Burada Java iki argüman görüyor:
2 → int
5.8 → double

Yani çağrının tipi (int, double).

Java uygun metodu arar (Overloading Resolution)
Java derleyicisi, topla() ismine sahip metotları tarar ve verilen argümanlara en uygun olanı bulur.

Aşağıdaki metotlar mevcut:
topla(int, int)
topla(int, int, int)
topla(double, double)
topla(double, int)

Eşleşme süreci (Type Promotion – Tür Yükseltme):
Java, argüman türleri tam olarak uyuşmadığında bazı dönüşümlere izin verir.
Özellikle, int → double dönüşümü mümkündür (güvenli bir genişletmedir).

Şimdi tek tek bakalım:
Metot	Uyumluluk Durumu
topla(int, int)	❌ Uyumlu değil (2. parametre double, int bekliyor)
topla(int, int, int)	❌ 3 parametre bekliyor, çağrıda sadece 2 var
topla(double, double)	✅ Uyumlu: 2 → double dönüştürülür, 5.8 zaten double
topla(double, int)	❌ İkinci parametre double, int değil

✅ En uygun eşleşme: topla(double, double)
Çalışan metot:
public static void topla(double a, double b) {
    System.out.println(a + b);
}

Bu metotta:a = 2.0  b = 5.8
Sonuç: 7.8 ekrana yazdırılır.

🧠 Sonuç:
Kodun çalışmasının nedeni:
Java, int değerini otomatik olarak double’a çevirebilir 
(genişletme – widening conversion).
Bu nedenle (int, double) çağrısına en uygun eşleşme(double, double) metodudur.
Derleyici bu metodu seçer ve 7.8 çıktısı üretilir.*/
}
