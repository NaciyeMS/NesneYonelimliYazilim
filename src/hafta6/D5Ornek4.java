package hafta6;

public class D5Ornek4 {

	public static void main(String[] args) {
		// dizideki elemanları sıralayan programı yazın 
int[] sayilar = {45, 12, 78, 34, 23, 90, 56};
        
        System.out.println("Sıralamadan önce:");
        for (int s : sayilar) {
            System.out.print(s + " ");
        }

        // Bubble Sort algoritması
        for (int i = 0; i < sayilar.length - 1; i++) {
            for (int j = 0; j < sayilar.length - 1 - i; j++) {
                if (sayilar[j] > sayilar[j + 1]) {
                    // yer değiştirme (swap)
                    int temp = sayilar[j];
                    sayilar[j] = sayilar[j + 1];
                    sayilar[j + 1] = temp;
                }
            }
        }

        System.out.println("\n\nSıralamadan sonra:");
        for (int s : sayilar) {
            System.out.print(s + " ");
        }
	}

}
/*Çalışma Mantığı

Dıştaki for diziyi baştan sona tekrar tekrar dolaşır.

İçteki for, yan yana elemanları karşılaştırır.

Eğer soldaki, sağdakinden büyükse yer değiştirir (swap).

En büyük değerler her turda sona doğru “baloncuk gibi” çıkar.

Döngüler tamamlanınca dizi küçükten büyüğe sıralanır */
