package hafta8.ders4SiniflardaPassByValue;

public class PassByValue3Runner {

	public static void main(String[] args) {
		NewClass obj= new NewClass(); //non primitive bir nesne oluşturuldu
		obj.value=20;  //o nesnenin value özelliğine değer atandı
		System.out.println(obj.value);///20
		degistirNesne(obj); //degistirNesne adındaki fonksiyonu non primitive bir değişken gönderildi
		//non primitive değişkenler adresini(referansını ) gönderir. 
		//degistirNesne Adındaki fonksiyonda value nin içindeki değer dğeiştirildi. 
		System.out.println(obj.value);//yeni değer ekrana yazdırıldı. 
		///30
		degistirReferansAdresi(obj);
		System.out.println(obj.value);// bir önceki değişen değer kaldı
		///30
	}

	private static void degistirReferansAdresi(NewClass obj) {
		obj=new NewClass(); 
		//bu satır ile yukarıdan gelen nesnenin adresi 
		//artık başka bir adres olarak belirlendi
		obj.value=55; 
		/*bu değer başka adresteki bir değer olduğu için 
		 * yukarıdaki asıl gönderilen nesneyi etkilemedi
		*/
	}

	private static void degistirNesne(NewClass obj) {
		obj.value=30;
		
	}

}
