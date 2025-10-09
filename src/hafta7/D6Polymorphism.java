package hafta7;

public class D6Polymorphism {

	public static void main(String[] args) {
		////Polymorphism (Çok Biçimlilik)
		/*Polymorphism, yani çok biçimlilik, Nesne Yönelimli Programlamanın 
		 * (OOP) temel ilkelerinden biridir.Bu kavram, bir metodun farklı 
		 * şekillerde çalıştırılabilmesini ve her durumda farklı sonuçlar 
		 * üretebilmesini sağlar.
		 * 
Java’da polymorphism iki şekilde uygulanır:
Method Overloading (Statik Polymorphism)
Method Overriding (Dinamik Polymorphism)

///1. Method Overloading (Metot Aşırı Yükleme)
Java’da Method Overloading, aynı sınıf içinde aynı isme sahip 
fakat farklı parametre listelerine sahip birden fazla metodun tanımlanması 
anlamına gelir.
Yani bir metodun ismi aynı kalır, 
ancak parametre sayısı veya türü değişirse bu durum overloading 
olarak adlandırılır.

Örnek:
String s = "Java";
s.substring(int beginIndex);          // tek parametreli versiyon
s.substring(int beginIndex, int endIndex); // iki parametreli versiyon

Burada her iki metot da substring ismine sahiptir,
 ancak parametre sayısı farklı olduğu için Java bunları iki ayrı metot 
olarak görür.

/Metot İmzası (Method Signature)
Bir metodun ismi ve parametre listesi birlikte onun imzasını (signature)
oluşturur.Metot aşırı yüklemede sadece parametrelerle oynanır; 
metot ismi aynı kalır.

/Overloading yapılırken dikkat edilecekler:
a) Parametre sayısı değiştirilebilir.
b) Parametrelerin veri tipleri farklı olabilir.
c) Parametre türleri farklıysa sıraları değiştirilebilir.

Not: return type, access modifier, veya metodun static olup
 olmaması overloading üzerinde herhangi bir etki oluşturmaz.*/
		
		  // Farklı parametrelerle topla metodlarını çağırıyoruz
        topla(3, 5);            // int, int
        topla(2, 4, 6);         // int, int, int
        topla(2.5, 3.5);        // double, double
        topla(4.2, 3);          // double, int
	}

   
public static void topla(int a, int b)        {  System.out.println(a+b);    }
public static void topla(int a, int b, int c) {  System.out.println(a+b+c);}
public static void topla(double a, double b)  {  System.out.println(a+b);    }
public static void topla(double a, int b)     {  System.out.println(a+b);    }
public static void topla(int a, double b)     {  System.out.println(a+b);    }

}
