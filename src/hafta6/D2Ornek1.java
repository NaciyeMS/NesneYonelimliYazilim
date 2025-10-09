package hafta6;

public class D2Ornek1 {

	public static void main(String[] args) {
		// Bir haftalık sıcaklığın tutulduğu bir dizi oluşturun. Ve o haftanın
		//ortalama sıcaklığını bulan programı yazın
		
		// 1 haftalık (7 gün) sıcaklık değerlerini bir diziye atayalım
        double[] sicakliklar = {18.5, 20.0, 22.3, 19.8, 21.0, 23.5, 20.7};
        double toplam = 0;
        
        // Dizideki tüm sıcaklıkları topluyoruz
        for (int i = 0; i < sicakliklar.length; i++) {
            toplam += sicakliklar[i];
        }
        
        // Ortalama hesaplama
        double ortalama = toplam / sicakliklar.length;
        
        // Sonucu ekrana yazdırma
        System.out.println("Haftalık Ortalama Sıcaklık: " + ortalama + " °C");
	}

}
