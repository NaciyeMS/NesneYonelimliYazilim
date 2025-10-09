// Paket isimlendirmesi: küçük harflerle ve noktalar ile ayrılır
// Örnek: package com.sirket.proje;
package hafta1;
//Sınıf isimlendirmesi: PascalCase
public class D2DegiskenTanimlamaKurallari {

	// Sabitler: UPPER_SNAKE_CASE
    public static final int MAKS_BAKIYE = 10000; // Maksimum bakiye
    public static final int DEFAULT_ZAMAN_ASIMI = 30; // Dakika cinsinden

    // Değişkenler: camelCase
    private String kullaniciAdi; // Kullanıcı adı
    private double bakiye;       // Hesap bakiyesi

    // Constructor (yapıcı metodlar da PascalCase)
    public D2DegiskenTanimlamaKurallari(String kullaniciAdi, double bakiye) {
        this.kullaniciAdi = kullaniciAdi;
        this.bakiye = bakiye;
    }

    // Metod isimlendirmesi: camelCase
    public void bakiyeGoster() {
        // Metod içi değişkenler: camelCase
        double geciciBakiye = this.bakiye; // Hesap bakiyesini geçici değişkene atama
        System.out.println("Kullanıcı: " + kullaniciAdi + " - Bakiye: " + geciciBakiye);
    }

    public boolean paraCek(double miktar) {
        if (miktar <= bakiye) {
            bakiye -= miktar;
            return true;
        } else {
            System.out.println("Yetersiz bakiye!");
            return false;
        }
    }
}

// Arayüz örneği: PascalCase
interface OdemeYapilabilir {
    // Metodlar camelCase
    void odemeYap(double miktar);
}

// Enum örneği: PascalCase
enum KullaniciDurumu {
    AKTIF,         // Sabitler: UPPER_SNAKE_CASE
    PASIF,
    ENGELLENMIS
}