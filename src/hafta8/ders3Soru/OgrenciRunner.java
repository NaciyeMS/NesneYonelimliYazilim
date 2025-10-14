package hafta8.ders3Soru;

public class OgrenciRunner {
///SORU
/*
Öğrenci Sınıfı (Ogrenci):

Öğrenciye ait şu bilgileri içeren özelliklere sahip olmalıdır:
adSoyad (String)
sinif (int)
tcNo (String)
ders (String)
dersNotu (double)
Constructor:
1. Constructor: Tüm özellikleri parametre olarak alan bir constructor tanımlayın.
2. Constructor: Sadece adSoyad, sinif ve tcNo alan bir constructor tanımlayın. 
Bu constructor'da ders ve dersNotu için varsayılan değerler atayın 
(örneğin, ders = "Henüz atanmadı" ve dersNotu = 0).

Metotlar:
notDurumu(): Ders notu 50 ve üzerindeyse "Geçti", aksi halde "Kaldı" mesajı döndüren metot.

harfNotu(): Ders notuna göre harf notu döndüren metot:
90-100: "AA"
80-89: "BA"
70-79: "BB"
60-69: "CB"
50-59: "CC"
0-49: "FF"

bilgileriGoster(): Öğrenci bilgilerini ekrana yazdıran metot.

Main Sınıfı:
main metodunda, her iki constructor'ı da kullanarak en az iki Ogrenci nesnesi oluşturun ve 
bu nesneler için bilgileriGoster() ve notDurumu() metodlarını çağırarak sonuçları ekrana yazdırın.
Örnek Çıktı:
Ad Soyad: Ahmet Yılmaz 
Sınıf: 10 
TC No: 12345678901
Ders: Matematik 
Ders Notu: 75.5 
Durum: Geçti 
Harf Notu: BB 


Ad Soyad: Elif Demir 
Sınıf: 9 
TC No: 10987654321 
Ders: Henüz atanmadı 
Ders Notu: 0.0 
Durum: Kaldı 
Harf Notu: FF

*/
	public static void main(String[] args) {
		
		 // 1. Constructor kullanımı
        Ogrenci ogr1 = new Ogrenci("Ahmet Yılmaz", 10, "12345678901", "Matematik", 75.5);

        // 2. Constructor kullanımı
        Ogrenci ogr2 = new Ogrenci("Elif Demir", 9, "10987654321");

        // Bilgileri göster
        ogr1.bilgileriGoster();
        ogr2.bilgileriGoster();
	}

}
