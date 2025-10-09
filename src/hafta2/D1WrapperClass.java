package hafta2;

public class D1WrapperClass {

	public static void main(String[] args) {
		/*ilkel değişkenlere bazen metodlar ve çeşitli özellikler eklemek isteriz
wrapper class java da primitive değişkenleri object veri tipine dönüştürmek için kullanılır.
Java da bulunan koleksiyonlar(arraylist vs) genellikle non pritimive değişkenleri kullandıkları için bu işleme ihtiyaç duyarız
En önemlisi de girilen veri üzerinde metod kullanımı açar
*/
		int a=5; //primitive
		Integer b=4; //wrapper class
		b.compareTo(8);//wrapper classların kendine has fonksiyonları bulunur 
		//wrapper'lar büyük harfle başlar çünkü class'tırlar
		// primitive----->wrapper class
		// char---------->Character         - 
		// boolean------->Boolean
		// byte---------->Byte
		// short -------->Short
		// int----------->Integer
		// long---------->Long
		// float  ------->Float
		// double-------->Double
		
		//AUTOBOXING
		/*Autoboxing, primitive bir türü otomatik olarak onunwrapper sınıfına çevirir.
		 *  Örneğin, long'u Long'a dönüştürür*/
		int x=4;
		Integer y=x;  //wrapper<=primitive
		
		
		//UNBOXING
		Integer k=4;
		int l=k;  //primitive<=wrapper
		
	}

}
