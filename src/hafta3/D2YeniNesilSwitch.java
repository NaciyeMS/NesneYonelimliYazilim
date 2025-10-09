package hafta3;

public class D2YeniNesilSwitch {

	public static void main(String[] args) {
		///ESKİ NESİL SWİTCH
		int ay = 6; // Örnek: 6. ay

		switch (ay) {
		    case 1:  System.out.println("Kış");       break;
		    case 2:  System.out.println("Kış");       break;
		    case 3:  System.out.println("İlkbahar");  break;
		    case 4:  System.out.println("İlkbahar");  break;
		    case 5:  System.out.println("İlkbahar");  break;
		    case 6:  System.out.println("Yaz");       break;
		    case 7:  System.out.println("Yaz");       break;
		    case 8:  System.out.println("Yaz");       break;
		    case 9:  System.out.println("Sonbahar");  break;
		    case 10: System.out.println("Sonbahar");  break;
		    case 11: System.out.println("Sonbahar");  break;
		    case 12: System.out.println("Kış");       break;
		    default: System.out.println("Hata");      break;
		}
		///YENİ NESİL SWİTCH
		 ay = 6; // Değişkene ay bilgisini atıyoruz (örnek: Haziran = 6)

		// Switch expression kullanıyoruz (Java 12+ ile gelen özellik).
		// Bu yapı switch'ten bir değer döndürür ve direkt değişkene atanabilir.
		String sonuc = switch (ay) {
		    case 12, 1, 2 -> "Kış";          // Eğer ay 12, 1 veya 2 ise "Kış"
		    case 3, 4, 5 -> "İlkbahar";      // Eğer ay 3, 4 veya 5 ise "İlkbahar"
		    case 6, 7, 8 -> "Yaz";           // Eğer ay 6, 7 veya 8 ise "Yaz"
		    case 9, 10, 11 -> "Sonbahar";    // Eğer ay 9, 10 veya 11 ise "Sonbahar"
		    default -> "Hata";               // Hiçbiri değilse "Hata"
		};

	}

}
