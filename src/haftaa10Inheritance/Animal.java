package haftaa10Inheritance;
///INHERITANCE///MİRAS///
/*ÖRNEK
 * Vehicle Sınıfı 			Car Sınıfı extends Vehicle
 * Vehicle Sınıfı 			Car Sınıfı(Vehicle dan Türetilmiş )(mirasçı)
 * --------------			---------------------
 * tekerlekSayisi===>		tekerlekSayisi
 * hiz			 ===>		hiz
 * yakit		 ===>		yakit
 * 							sunRoof(kendi sınfına ait özellik)
 * 
 * 
   1. Kodun Yeniden Kullanılabilirliği (Reusability)
Miras sayesinde, bir sınıf içinde tanımlanan özellikler ve yöntemler 
(metodlar), başka sınıflar tarafından tekrar kullanılabilir. 
Yeni bir sınıf yazarken sıfırdan başlamak yerine mevcut bir 
sınıfın özelliklerini ve davranışlarını miras alabilirsiniz.
Örneğin, Vehicle sınıfından Car ve Motorcycle sınıfları 
türetilirse, Vehicle sınıfındaki temel özellikler 
(tekerlek sayısı, hız, yakıt türü gibi) tekrar
 tanımlanmadan bu alt sınıflar tarafından kullanılabilir.

 2. Kod Bakımı ve Geliştirmeyi Kolaylaştırır (Maintainability)
Kodda değişiklik yapmak gerektiğinde, temel sınıf üzerinde
yapılan değişiklikler otomatik olarak alt sınıflara yansır.
Bu, kodun bakımını kolaylaştırır ve yazılım geliştirme sürecinde 
tutarlılığı sağlar.
Örneğin, Person sınıfında bir değişiklik yapıldığında,
Student veya Teacher gibi bu sınıftan türeyen sınıflarda 
da otomatik olarak bu değişiklikten yararlanılır.
 3. Genel Özelliklerin Merkezileştirilmesi (Centralization)
Ortak özelliklerin ve metodların bir üst sınıfta toplanması, 
kodun merkezi bir yerde yönetilmesini sağlar. 
Bu da sınıflar arasında kod tekrarını azaltır.
Örneğin, bir şirketin çalışanlarını temsil eden
 bir yazılımda Employee adında bir sınıf oluşturup 
 bu sınıftan Manager, Developer, Tester gibi sınıflar
  türetmek, tüm çalışanlar için ortak olan salary veya 
  workingHours gibi özelliklerin merkezi bir yerde 
  tanımlanmasını sağlar.

  4. Daha Anlaşılır Kod ve Organizasyon (Clearer Code Structure)
Miras, sınıflar arasında doğal bir hiyerarşi oluşturur ve kodun 
yapısını daha anlaşılır hale getirir. Bu, karmaşık sistemlerin 
daha düzenli ve anlaması kolay bir şekilde modellenmesine 
yardımcı olur.
Örneğin, hayvanlar dünyasını modellemek istiyorsanız, Animal 
adlı bir üst sınıf oluşturup Mammal, Bird, Fish gibi alt 
sınıflar tanımlamak daha anlaşılır bir yapı sağlar.

  5. Polimorfizmi Destekler (Supports Polymorphism)
Miras ilişkisi, polimorfizmi desteklediği için farklı sınıfların
 ortak bir arayüz üzerinden ele alınmasına imkan tanır. 
 Bir üst sınıftan türeyen farklı sınıflar, aynı metodları 
 farklı şekillerde uygulayabilir.
Örneğin, Animal sınıfında bir makeSound() metodu tanımlayıp, 
Dog, Cat gibi alt sınıflarda bu metodu kendilerine has bir 
şekilde yeniden tanımlayabilirsiniz. Bu sayede bir Animal 
nesnesi olarak ele alınan 
Dog veya Cat, kendi seslerini çıkarabilir.
*/
/*
 ÖRNEK
 * Animal Sınıfı 			Mammal Sınıfı extends Animal
 * Animal Sınıfı 			Mammal Sınıfı(Animal dan Türetilmiş )(mirasçı)
 * --------------			---------------------
 * eat()		===>		eat()
 * drink()		===>		drink()	
 * 							feedwithMilk() //(kendi sınfına ait özellik)
 * 							
 * 
 * 
 * */
public class Animal {
	public void eat() {
		System.out.println("Hayvanlar yer.");
	}
	public void drink() {
		System.out.println("Hayvanlar içer.");
	}
	//NOT: static sınıflar miras olarak aktarılmaz
}
