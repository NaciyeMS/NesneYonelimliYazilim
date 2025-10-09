package hafta7;
///PASS BY VALUE
///REFERANS DEĞİŞTİRME
/*Referans türleri (nesneler) de pass by value ile aktarılır, 
 * ancak burada dikkat edilmesi gereken nokta, referansın kendisinin 
 * bir kopyasının aktarılmasıdır. Yani metot içinde bu referans üzerinden
 *  nesnenin içeriğine erişilebilir ve bu içerik değiştirilebilir,
 *   FAKAT REFERANSIN KENDİSİ DEĞİŞTİRİLİRSE orijinal nesne etkilenmez.*/
public class De18PassByValueYeniReferansOlusturma {
	 public static void main(String[] args) {
	        int[] dizi = {10}; 
	        // dizi bir adet sayı içeriyor
	        diziyiDegistir(dizi); // Dizinin içeriği değiştiriliyor
	        System.out.println("diziyiDegistir sonrası: " + dizi[0]);
	        // Çıktı: 20
	        referansiDegistir(dizi); // Referans başka bir diziye atanıyor
	        System.out.println("referansiDegistir sonrası: " + dizi[0]); 
	        // Çıktı: 20 (değişmez)
	    }
	    public static void diziyiDegistir(int[] d) {
	        d[0] = 20; // Dizinin içeriği değişir (aynı nesneye erişiyoruz)
	    }
	    public static void referansiDegistir(int[] d) {
	        d = new int[1]; // Yeni bir diziye referans atanıyor
	        d[0]=30; // Bu değişiklik sadece bu metodun içindedir
	    }
}
