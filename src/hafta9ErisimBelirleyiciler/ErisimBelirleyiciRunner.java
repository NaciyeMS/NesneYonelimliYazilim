package hafta9ErisimBelirleyiciler;

public class ErisimBelirleyiciRunner {
	public static void main(String[] args) {
		ErisimBelirleyiciSinif e1=new ErisimBelirleyiciSinif();
		System.out.println(e1.publicDegisken); //her yerden ulaşılabilir olduğu için ✓  		
		System.out.println(e1.protectedDegisken);//AYNI PAKET İÇİNDE olduğu için ✓  
		System.out.println(e1.defaultDegisken); //AYNI SINIF İÇİNDE olduğu için  ✓  
		System.out.println(e1.privateDegisken); 
		//AYNI PAKET İÇİNDE olsa BİLE privete içinde bulunduğu sınıf a ait olduğu için ✗
		
		
		/*
		      ===========================
			       ACCESS MODIFIERS
			  ===========================

			  Modifier   |Package    | 
			  ------------------------
			  public     |     ✓     | 
			  protected  |     ✓     | 
			  default    |     ✓     | 
			  private    |     ✗     | 
			  -------------------------
*/
	}

}

///ACCESS MODIFIER ERİŞİM BELİRLEYİCİLER
/*===========================
     ACCESS MODIFIERS
===========================

Modifier   |  Class   |  Package  |  SubClass  |  Global
--------------------------------------------------------
public     |    ✓     |     ✓     |     ✓      |    ✓
protected  |    ✓     |     ✓     |     ✓      |    ✗
default    |    ✓     |     ✓     |     ✗      |    ✗
private    |    ✓     |     ✗     |     ✗      |    ✗
--------------------------------------------------------

public    → Her yerden erişilebilir.
protected → Aynı paketten veya alt sınıflardan erişilebilir.
default   → Sadece aynı paket içinden erişilebilir.
private   → Sadece aynı sınıf içinden erişilebilir.
*
*public > protected > default > private
*
==> public olanlar her class’dan kullanılabilir
	Örnek: Bir üniversite kampüsündeki kütüphane gibi düşünün. 
	Kütüphane, kampüsteki herkesin erişimine açık. 
	İsteyen herkes içeri girebilir ve kitaplara ulaşabilir. 
	Yani, sınıf veya metotlar "public" olarak tanımlandığında, 
	uygulamanın her yerinden erişilebilirler.

==> protected olanlar başka package’lardan kullanılamaz, 
	ancak başka package’larda child classlar içinden kullanılabilir
	Örnek: Bir ailedeki aile albümü gibi düşünebiliriz. 
	Bu albümü yalnızca aile üyeleri görebilir. Aile dışından kimse albüme erişemez, 
	ama aile içinde miras kalan kişiler (örneğin çocuklar) bu albüme erişebilir. 
	"Protected", bir sınıftaki üye değişken ya da metodun sadece aynı paketteki diğer
	 sınıflar ve o sınıftan türetilen alt sınıflar tarafından erişilebilir olduğunu ifade eder.


==> default olanlar başka package’lardan kullanılamazlar
	Örnek: Apartman dairesinin ortak kullanım alanları gibi düşünün. 
	Bu alanlara sadece apartmanda yaşayanlar erişebilir, 
	ama dışarıdan biri erişemez. Java'da bir sınıf veya üye
	 herhangi bir access modifier ile tanımlanmadığında, varsayılan olarak 
	 "package-private" olur ve sadece aynı paket içindeki sınıflar erişebilir.

==> private olanlar sadece oluşturuldukları class içinden kullanılabilirler. (Package-Private)
	Örnek: Evinizin içindeki özel bir kasa gibi düşünün.
	Bu kasa, sadece anahtarı olan kişi tarafından açılabilir. 
	Dışarıdan kimse kasaya doğrudan erişemez. "Private" erişim belirleyici de 
	benzer şekilde, bir sınıf içindeki private metot veya değişkenlere sadece 
	o sınıfın içinde erişilebilir.
* */
