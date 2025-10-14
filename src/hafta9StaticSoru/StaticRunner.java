package hafta9StaticSoru;

public class StaticRunner {
/*SORU: 
 * Aşağıdaki gereksinimlere uygun bir Person sınıfı yazınız ve
belirtilen işlemleri yaparak main metodunda test ediniz:

Person sınıfı içinde:
name isminde public bir String alan tanımlayın.
age isminde public bir int alan tanımlayın.
public static bir int değişkeni olan personCount tanımlayın. 
Bu değişken, oluşturulan Person nesnelerinin sayısını tutmalıdır.

Sınıfa bir constructor ekleyin ve bu constructor 
her çağrıldığında personCount değişkenini bir artırarak nesne sayısını takip edin.

personCount değişkeninin değerini döndüren bir public static getPersonCount metodu ekleyin.

personCount'u ekrana yazdıran bir public static printPersonCount metodunu ekleyin.

Başka bir Person nesnesinin yaşını değiştiren public bir changeAge metodunu ekleyin.
Bu metod, bir Person nesnesi ve yeni bir yaş değeri almalıdır.

main metodunda:
Üç farklı Person nesnesi oluşturun: 
p1, p2, ve p3. p1 için ismi "Ali" ve yaşı 25 olarak başlatın. 
p2 için ismi "Veli" ve yaşı 30 olarak başlatın. 
p3 için ismi "Ayşe" ve yaşı 28 olarak başlatın.

Person nesnelerinin oluşturulmasından sonra, 
printPersonCount metodunu kullanarak kaç Person nesnesi oluşturulduğunu ekrana yazdırın.
p1 nesnesini kullanarak p2 nesnesinin yaşını 35 olarak değiştirin.
p2 ve p3 nesnelerinin yaşlarını ekrana yazdırın.
Değişikliklerden sonra printPersonCount metodunu tekrar kullanarak
 kaç nesne olduğunu ekrana yazdırın.


*/
	 // 1️⃣ Üç farklı Person nesnesi oluştur
    Person p1 = new Person("Ali", 25);
    Person p2 = new Person("Veli", 30);
    Person p3 = new Person("Ayşe", 28);

    // 2️⃣ Oluşturulan kişi sayısını yazdır
    Person.printPersonCount();

    // 3️⃣ p1 nesnesi, p2'nin yaşını 35 olarak değiştirsin
    p1.changeAge(p2, 35);

    // 4️⃣ p2 ve p3'ün yaşlarını ekrana yazdır
    System.out.println(p2.name + " adlı kişinin yaşı: " + p2.age);
    System.out.println(p3.name + " adlı kişinin yaşı: " + p3.age);

    // 5️⃣ Tekrar kişi sayısını yazdır
    Person.printPersonCount();
}
