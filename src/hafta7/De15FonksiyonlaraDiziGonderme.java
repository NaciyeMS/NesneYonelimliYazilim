package hafta7;

public class De15FonksiyonlaraDiziGonderme {
/*Bu örnekte, dizinin tamamını hesapla metoduna gönderiyoruz. 
 * Yani dizi değişkeni, tüm elemanlarıyla birlikte metoda aktarılıyor 
 * ve metod içinde for-each döngüsü ile her bir eleman üzerinde 
 * işlem yapabiliyoruz.
"Dizinin tüm elemanları metoda gönderilerek tek tek işlenebilir."*/
	public static void main(String[] args) {
		int []dizi= {5,6,9,8,91};
		hesapla(dizi);
	}
	private static void hesapla(int []di) {
		for (int j : di) {
			System.out.print(j+"-");
		}		
	}

}
