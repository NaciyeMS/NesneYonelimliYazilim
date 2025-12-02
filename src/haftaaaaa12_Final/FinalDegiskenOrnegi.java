package haftaaaaa12_Final;

public class FinalDegiskenOrnegi {

	public static void main(String[] args) {
		//DEĞİŞKENİ FİNAL TANIMLAMAK
		//içindeki değeri asla değiştiremeyeceksin demek
		final int MAX_AGE=100; //upper snake case
		/*Verileirn
		 * saklanması
		 * sonradan kullanılması
		 * değiştirilebilmesi (YAPAMIYORUZ)
		 */
		System.out.println(MAX_AGE);
		System.out.println(MAX_AGE*3);
		//MAX_AGE=105; //içindeki değeri değiştirmek isterseniz
		//hata verir çalışmaz
		//compile error 

	}

}
/*
Final değişken: Sabit olarak tanımlanır, bir kez atandıktan sonra değiştirilemez.
Final metod: Alt sınıflarda override edilemez.
Final sınıf: Başka sınıflar tarafından miras alınamaz.
*/
