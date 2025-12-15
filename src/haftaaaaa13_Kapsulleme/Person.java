package haftaaaaa13_Kapsulleme;

public class Person {
 private int age=8; //kapsüllenmiş 
 private String ad;
 //getter ve setter 
 public int getAge() {//getter metodu
	 return this.age;
 }
 public void setAge(int a) { //setter
	 if(a<0)
		 System.out.println("pozitif bir değer giriniz");
	 else 
	 this.age=a;
 }
 public String getAd() {
	return ad;
 }
 public void setAd(String ad) {
	this.ad = ad;
 }


 
 
 
 
}
////KAPSÜLLEME
///
/*Java'da kapsülleme (encapsulation), nesne yönelimli programlamanın (OOP)
 *  temel prensiplerinden biridir.
 
 Kapsülleme, bir sınıfın verilerini (değişkenlerini) ve bu verilere erişim 
 sağlayan yöntemleri (metotları) bir arada tutma ve bu verilere doğrudan dışarıdan
  erişimi kısıtlama işlemidir.
//AMAÇLARI
///Veri gizliliği: Sınıfın içinde tanımlanan değişkenlere doğrudan erişimi engeller 
///ve dış dünyadan gizler.
///Kontrollü erişim: Verilere erişimi getter ve setter metotlarıyla düzenler.
///Kodun sürdürülebilirliği: Verileri kontrol eden metotlar sayesinde kodun daha 
///güvenli ve bakımı kolay olur.
///Veri bütünlüğü: Yanlış veya geçersiz verilerin sınıfa atanmasını engelleyebilir.

//Kapsülleme Verilerin Gizliliği
///Sınıfın değişkenlerini private yaparak, başka bir sınıfın ya da dış dünyanın bu verilere doğrudan erişmesini engellersiniz. Bu, yanlışlıkla ya da kötü niyetli olarak verilere müdahale edilmesini önler. 
Örnek:Bir bankanın müşteri bakiyesini tutan bir sistemde, bakiyeye doğrudan erişim verilirse şu durum oluşabilir:

account.balance = -500; // Negatif bakiye atanabilir, bu mantıksız!

Kapsülleme ile bu tür hataların önüne geçilir:

public void setBalance(double balance) {
    if (balance >= 0) {
        this.balance = balance;
    } else {
        System.out.println("Bakiye negatif olamaz!");
    }
}


//Kapsülleme Verilere Kontrollü Erişim
///Getter ve setter metotları ile değişkenlere erişim sağlanır. Böylece:
Değişkenlere erişim ya da değiştirme işlemleri sınıfın kontrolü altında olur.
Gerektiğinde ek kontroller veya işlem sırasında başka işlemler de yapılabilir.
Örnek: Bir kişinin yaşını negatif yapmamak için doğrulama eklenebilir:

public void setAge(int age) {
    if (age > 0) {
        this.age = age;
    } else {
        System.out.println("Yaş negatif olamaz!");
    }
}
}

//Kapsülleme Kodun Sürdürülebilirliğini Artırır
///Kapsülleme ile bir sınıfın iç yapısında değişiklik yapsanız bile, dışarıdan bu sınıfı kullanan kodları değiştirmek zorunda kalmazsınız.
Örnek: Eğer bir sınıfın veri tutma mantığını değiştirmeniz gerekirse (örneğin, bir String yerine List<String> kullanmak gibi), getter ve setter metotlarının imzaları aynı kalırsa, bu sınıfı kullanan diğer kodlar etkilenmez.


//Kapsülleme Verinin Bütünlüğünü Korur
///Verilere doğrudan erişim engellendiği için, yanlış ya da geçersiz değerlerin atanması kontrol altına alınır. Bu, uygulamanızdaki hataları ve tutarsızlıkları azaltır.
Örnek: Bir ürünün fiyatı hiçbir zaman negatif olamaz:
public void setPrice(double price) {
    if (price >= 0) {
        this.price = price;
    } else {
        System.out.println("Fiyat negatif olamaz!");
    }
}

// Bağımlılığı Azaltır
Kapsülleme sayesinde, bir sınıfın iç detayları gizlenir (abstraction). Dışarıdaki kod, bir sınıfın yalnızca ne yaptığını bilir, nasıl yaptığını bilmek zorunda kalmaz. Bu da sınıflar arasında düşük bağımlılık sağlar.


// Daha Modüler ve Esnek Kodlama
Kapsülleme, sınıfın sorumluluklarını net bir şekilde sınırlandırır. Bu da kodun daha kolay test edilebilir, modifiye edilebilir ve yeniden kullanılabilir olmasını sağlar.

//AVANTAJLARI
///Güvenlik: Veriler yetkisiz erişimden korunur.
///Esneklik: Verilere erişimi ve güncellemeyi kontrol etmek kolaylaşır.
///Bakım Kolaylığı: Kodda değişiklik yapılması gerektiğinde sadece setter ve getter metotlarını düzenlemek yeterlidir.
///Kapsülleme ile daha güvenli ve sürdürülebilir bir yapı elde edersiniz!

 */
 
