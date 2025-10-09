package hafta4;

public class D2Soru1 {

	public static void main(String[] args) {
		/*Ürünlerin Fiyatlarını Toplama
		Bir mağazada satışa sunulan ürünlerin fiyat bilgileri 
		para birimi işareti ($) ile birlikte String tipinde 
		tutulmaktadır.Aşağıdaki ürünlerin toplam fiyatını 
		hesaplayan bir Java programı yazınız:
		Telefon: $299.50
		Tablet: $450.75
		Beklenen çıktı:
		Toplam fiyat: 750.25
		*/
		        String telefon = "$299.50";
		        String tablet = "$450.75";

		        // Para işaretini kaldır ve double'a çevir
		        double telefonFiyat = Double.parseDouble(telefon.replace("$", ""));
		        double tabletFiyat = Double.parseDouble(tablet.replace("$", ""));

		        double toplam = telefonFiyat + tabletFiyat;

		        System.out.println("Toplam fiyat: " + toplam);
		
	}

}
