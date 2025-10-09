package hafta4;

public class D3StringManipulasyon {

	public static void main(String[] args) {
		String s1 = "";
		System.out.println(s1.isEmpty());  // true
		System.out.println(s1.isBlank());  // true
		/*//isEmpty() metodu sadece hiçliği kontrol eder (true verir).
		Sadece karakter uzunluğunu kontrol eder.
		Yani length() == 0 demektir.
		Eğer String içinde hiç karakter yoksa true döner.
		
		*/
		String s2 = "   ";  
		System.out.println(s2.isEmpty());  
		// false (çünkü 3 karakter var)
		System.out.println(s2.isBlank());  
		// true  (çünkü sadece boşluklardan oluşuyor)
		/*
		 * //isBlank() metodu ise hem hiçliği hem de space'i kontrol eder(true verir)
		Java 11 ile geldi.
		String boş mu ya da sadece boşluklardan (space, tab, \n vs) mı oluşuyor onu kontrol eder.
		Yani " " (sadece boşluk) için true döner, ama isEmpty() burada false döner.

		 */
	}

}
