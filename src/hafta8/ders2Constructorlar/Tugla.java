package hafta8.ders2Constructorlar;
///CONSTRUCTOR
/*Class'tan object oluşturmamızı sağlayan bölümdür.
Class oluşturduğumuzda Java bize otomatik olarak bir constructor verir.
Bu constructor'lara "default constructor" denir.default constructor ===>
Tugla d1= new Tugla(); kodunda
new Tugla() kısmı bir contructor çalıştırır. 

Her defasında sabit özelliklerde nesne üretmek istemezsek?
Yeni constructorlar oluştururuz. 
Kendiniz constructor'inizi oluşturduğunuz zaman Java default constructor'i siler
Nasıl oluşturulur

Access Modifier + Class ismi + () +
{

 }*/
public class Tugla {
	//özellikleri
	 int tuglaEn=10;
	 int tuglaBoy=5;
	 int tuglaYukseklik=10;
	 //CONSTRUCTOR 1
	 public Tugla(int en, int boy, int yukseklik) {
		 this.tuglaEn=en;
		 this.tuglaBoy=boy;
		 this.tuglaYukseklik=yukseklik;
	 } 
	 //CONSTRUCTOR 2
	 //Constructor lar aslında aşırı yüklenmiş fonksiyonlara örnektir
	 //parametre sayıları ya da parametre türleri birbirinden farklı olursa 
	 //birden fazla contructor oluşturulabilir. 
	 //yükseklik değeri ne olacak? 
	 //yükseklik değer, default olarak tanımlanan tuglaYukseklik =10 degeri atanır. 
	 public Tugla(int en, int boy) {
		 this.tuglaEn=en;
		 this.tuglaBoy=boy;
	 } 
	 //CONSTRUCTOR 3
	 //Yeni bir constuctor oluşturulduğunda default contructor silinir
	 //bu default contructor ı yeniden aktif etmek için onu da yeniden tanımlamanız gerekir.
	 /* bu şekilde tanımlandığında 
	  * default olarak tanımlanan tuglaEn değeri 10 
	  * tuglaBoy degeri 5
	  * tuglaYuksek lik değeri 10 olacaktır. 
	  * 
	  * yani başlangıçta verilen özellikler kullanılacaktır. */
	 public Tugla() {
		 
	 } 
	 
	//metodları 
	public  void hacim() {
		int hacim=tuglaEn*tuglaBoy*tuglaYukseklik;
		System.out.println("tuğlanın hacmi:"+hacim);
	}
	
	///TO STRİNG METODU 
	/*Java’da toString metodu genellikle bir nesnenin içeriğini 
	 * okunabilir bir String olarak döndürmek için kullanılır.
*/
	@Override
	public String toString() {
		return "Tugla [tuglaEn=" + tuglaEn + ", tuglaBoy=" + tuglaBoy + ", tuglaYukseklik=" + tuglaYukseklik + "]";
	}
	

}