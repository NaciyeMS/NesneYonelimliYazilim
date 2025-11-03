package haftaaa10StaticBlok;

public class StaticBlokSoru {
	 static double price;  // fiyat değişkeni (tüm sınıfta geçerli)

	    // Static block: sınıf yüklendiğinde otomatik çalışır
	    static {
	        System.out.println("Static block çalıştı.");
	        
	        // Şubat ayı için indirim uygulama
	        price = 100.0; // normal fiyat
	        java.time.Month month = java.time.LocalDate.now().getMonth();
	        
	        if (month == java.time.Month.FEBRUARY) {
	            price = price * 0.8;  // %20 indirim
	            System.out.println("Şubat ayı indirimi uygulandı.");
	        }
	    }
	public static void main(String[] args) {
		 System.out.println("Ana metot çalıştı.");
	       System.out.println("Geçerli fiyat: " + price + " TL");

	}

}
