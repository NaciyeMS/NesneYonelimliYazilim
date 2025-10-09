package hafta6;

public class D4Ornek3 {

	public static void main(String[] args) {
		// dizideki en büyük elemanı bulan program 
		 // Bir dizi oluşturalım
        int[] sayilar = {25, 67, 12, 89, 45, 90, 34};
        
        // İlk elemanı başlangıç için en büyük kabul ediyoruz
        int enBuyuk = sayilar[0];
        
        // Diziyi tarayarak en büyük elemanı buluyoruz
        for (int i = 1; i < sayilar.length; i++) {
            if (sayilar[i] > enBuyuk) {
                enBuyuk = sayilar[i];
            }
        }
        
        System.out.println("Dizideki en büyük eleman: " + enBuyuk);
	}

}
/*📌 Çalışma Mantığı

sayilar[0] başlangıçta en büyük sayı olarak kabul edilir.

Döngüyle dizideki her eleman karşılaştırılır.

Daha büyük bir sayı bulunursa enBuyuk değişkeni güncellenir.

Döngü bittiğinde dizinin en büyük elemanı ekrana yazdırılır. ✅*/
