package hafta6;

import java.util.Scanner;

public class D3Ornek2 {

	public static void main(String[] args) {
		/*Bir haftalık sıcaklığın tutulduğu boş bir dizi oluşturun.
		 *  Kullanıcıdan her güne ait sıcaklıkları tek tek alın.
		 *   Ve o haftanın ortalama sıcaklığını bulan programı yazın.
*/
		Scanner scanner = new Scanner(System.in);

        // 1 haftalık sıcaklıklar için boş bir dizi oluşturduk
        double[] sicakliklar = new double[7];
        double toplam = 0;

        // Kullanıcıdan 7 gün için sıcaklık değerlerini alıyoruz
        for (int i = 0; i < sicakliklar.length; i++) {
            System.out.print((i + 1) + ". gün sıcaklığını giriniz: ");
            sicakliklar[i] = scanner.nextDouble();
            toplam += sicakliklar[i]; // girilen değeri toplama ekle
        }

        // Ortalama hesaplama
        double ortalama = toplam / sicakliklar.length;

        System.out.println("\nHaftalık Ortalama Sıcaklık: " + ortalama + " °C");

	}

}
