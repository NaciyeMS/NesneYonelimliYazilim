package haftaaaaa12_Overriding;

public class Payment {
// ödeme işlemleri parent class
	public void processPayment(double amount) {
		System.out.println("Ödeme işleniyor"+amount+"TL");
	}
}
/*
 * Polymorphism (Çok Biçimlilik),
 *  nesne yönelimli programlamada, bir sınıfın farklı şekillerde 
 *  davranabilmesi anlamına gelir. 
 *  Java’da polymorphism, aynı isimdeki bir metodu farklı 
 *  sınıflarda veya aynı sınıf içinde farklı parametrelerle 
 *  kullanabilme yeteneği sağlar. 
 *  Polymorphism iki ana şekilde uygulanabilir
 *  Method Overriding (Metod Geçersiz Kılma): 
 *  Bir alt sınıfın, üst sınıfında tanımlı bir 
 *  metodu kendine göre yeniden tanımlaması.
 *  Method Overloading (Metod Aşırı Yükleme): 
 *  Aynı sınıf içinde aynı isimli metotların farklı 
 *  parametrelerle tanımlanması. 
 *  
 *  /////DİKKKAT
 *  private method'lar override edilemezler çünkü; override edebilmek için o metoda başka bir class'dan ulaşabilmek gerekir. Ama private metotlar başka classlardan ulaşılamaz metotlardır.
 *Static method'lar override edilemezler çünkü; static variable veya
 metotlar tüm objeler için ortaktır. Java static metotların override 
edilmesine müsaade etmez.
 *Final method'lar override edilemezler; çünkü; Methot, final olarak işaretlenerek nihai ve değiştirilemez hale getirilir. Final olarak işaretlenmiş bir methodu child lar değiştiremez veya üzerine yazamaz.Final Variables, Final Classes, Final Parametreler'de olabilir.Sonuç: "Final" kelimesi, programcılara kodlarını daha güvenli ve öngörülebilir hale getirme, optimizasyon sağlama veya belirli davranışları zorlamada yardımcı olmak için kullanılır.
  * ///AVANTAJLARI
  * Kod Esnekliği ve Genişletilebilirlik: Yeni sınıflar eklenebilir ve polymorphism sayesinde kodun geri kalanında çok az veya hiç değişiklik yapmadan mevcut yapı genişletilebilir.
Bakımı Kolaylaştırır: Polymorphic bir yapı ile nesnelerin davranışları kolayca değiştirilebilir ve güncellenebilir.
Kodun Tekrar Kullanılabilirliği: Üst sınıfta tanımlanan ortak özellikler ve davranışlar alt sınıflar tarafından devralındığı için kod tekrarı azaltılır.


 */