package hafta7;

public class D1Fonksiyonlar {

	public static void main(String[] args) {
		/*Bir program yazarken, tasarlarken belli kod bloklarını 
		 * sık sık kullanırız.
		 *  Bu kod bloklarını tekrar tekrar yazmak yerine bir 
		 *  defa yazıp o kodları çağırabiliriz.
		 *  Java’da Metot Oluşturma

		Java’da bir metodun (örneğin main metodu) içinde başka bir metot 
		tanımlanamaz.Ancak, bir metodun içinde yerel (local) bir iç sınıf 
		(inner class) oluşturulabilir ve bu sınıfın içinde metotlar tanımlanabilir.
		Bu şekilde oluşturulan Local Inner Class, sadece tanımlandığı metodun
		 (örneğin main) içerisinde kullanılabilir; bu metodun dışından erişilemez.
		
		////Metot Oluşturma Adımları
		Java’da bir metot tanımlamak için şu adımlar izlenir:
		Metotlar, class bloğunun içinde ama main metodunun dışında tanımlanır.
		
		////Temel yazım (syntax) şöyledir:
		Erişim Belirleyici (Access Modifier) + Dönüş Tipi (Return Type) + Metot Adı + () + {}
		
		Oluşturulan metot, main metodundan çağrılarak kullanılır.
		Bu işleme metot çağrısı (method call) denir.
		
		////Parametre ve Argüman
		main metodunda bir metot çağrılırken kullanılan değerler 
		(örneğin sum(3, 5) ifadesindeki 3 ve 5) argüman olarak adlandırılır.
		Metodun tanımında bu değerleri karşılayan değişkenlere ise parametre denir 
		(örneğin sum(int a, int b) tanımındaki a ve b parametredir). */
		
		System.out.println(topla1(8, 9)); //1
		topla2(8, 9);//2
		System.out.println(topla3());//3
		topla4();//4
	}
	
	//1.PARAMETRE ALAN -GERİYE DEĞER DÖNDÜREN FONKSİYON
	public static int topla1 (int x, int y) 
	{ 
	int toplam=x+y;
	return toplam; 
	} 
	//2.PARAMETRE ALAN -GERİYE DEĞER DÖNDÜRMEYEN FONKSİYON
	public static void topla2 (int x, int y) 
	{ 
	int toplam=x+y;
	System.out.println(toplam);
	} 
	//3.PARAMETRE ALMAYAN -GERİYE DEĞER DÖNDÜREN FONKSİYON
	public static int topla3 () 
	{ 
	int toplam=8+9;
	return toplam; 
	} 
	//4.PARAMETRE ALMAYAN -GERİYE DEĞER DÖNDÜRMEYEN FONKSİYON
	public static void topla4 () 
	{ 
	int toplam=9+8;
	System.out.println(toplam);
	} 	


}
