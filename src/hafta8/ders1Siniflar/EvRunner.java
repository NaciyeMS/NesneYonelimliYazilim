package hafta8.ders1Siniflar;

public class EvRunner {

	public static void main(String[] args) {
		Tugla d1= new Tugla(); //Tugla sınıfından bir nesne tanımlandı
		System.out.println(d1.boy); //tanımlanan d1 nesnesi Tugla sınıfına ait bütün özellikleri taşıyor.
		System.out.println(d1.en); //en boy ve yükseklik olarak belirlenen her özelliğe ulaşabildik
		System.out.println(d1.yukseklik);
		d1.hacim(); //hacim ismindeki metoduna da ulaşabildik. 
		
		// artık istediğimiz kadar Tugla sınıfından nesne oluşturabilir 
		//ve bunların hem özelliklerini hem de metodlarını kullanabilriz
		Tugla d2=new Tugla();
		d2.hacim();
		Kapi k1= new Kapi();
		k1.kapiAc();
		
}

}
