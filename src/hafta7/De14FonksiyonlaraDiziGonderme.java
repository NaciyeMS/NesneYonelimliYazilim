package hafta7;

public class De14FonksiyonlaraDiziGonderme {
/*Bu örnekte, bir dizinin tamamını değil, 
 * yalnızca belirli bir indeksteki (dizindeki) değeri metoda gönderiyoruz.
 *  Yani dizi[3] ifadesiyle dizinin 3. indeksindeki değer (8) 
 *  hesapla metoduna iletiliyor ve metod içinde bu değer işleniyor.

"Dizinin tamamı yerine, sadece belirli bir indeksteki değer 
metoda gönderilerek işlenebilir."*/
	public static void main(String[] args) {
		int []dizi= {5,6,9,8,91};
		hesapla(dizi[3]);
	}
	private static void hesapla(int i) {
		System.out.println(i*5);		
	}

}
