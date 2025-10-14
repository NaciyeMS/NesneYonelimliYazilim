package hafta8.ders3Soru;

public class Ogrenci {
	String adSoyad;
	int sinif;
	String tcNo;
	String ders;
	double dersNotu;
	public Ogrenci(String adSoyad, int sinif, String tcNo, String ders, double dersNotu) {
		this.adSoyad = adSoyad;
		this.sinif = sinif;
		this.tcNo = tcNo;
		this.ders = ders;
		this.dersNotu = dersNotu;
	}
	public Ogrenci(String adSoyad, int sinif, String tcNo) {
		this.adSoyad = adSoyad;
		this.sinif = sinif;
		this.tcNo = tcNo;
		this.ders = "Henüz atanmadı";
		this.dersNotu =0;
	}
	  // notDurumu(): Ders notuna göre geçti/kaldı döndürür
	    public String notDurumu() {
	        if (dersNotu >= 50)
	            return "Geçti";
	        else
	            return "Kaldı";
	    }
	 // harfNotu(): Harf notunu döndürür
	    public String harfNotu() {
	        if (dersNotu >= 90) return "AA";
	        else if (dersNotu >= 80) return "BA";
	        else if (dersNotu >= 70) return "BB";
	        else if (dersNotu >= 60) return "CB";
	        else if (dersNotu >= 50) return "CC";
	        else return "FF";
	    }

	    // bilgileriGoster(): Tüm bilgileri ekrana yazar
	    public void bilgileriGoster() {
	        System.out.println("Ad Soyad: " + adSoyad);
	        System.out.println("Sınıf: " + sinif);
	        System.out.println("TC No: " + tcNo);
	        System.out.println("Ders: " + ders);
	        System.out.println("Ders Notu: " + dersNotu);
	        System.out.println("Durum: " + notDurumu());
	        System.out.println("Harf Notu: " + harfNotu());
	        System.out.println();
	    }
}
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

bilgileriGoster(): Öğrenci bilgilerini ekrana yazdıran metot.*/