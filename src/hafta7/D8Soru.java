package hafta7;

public class D8Soru {

	 public static void main(String[] args) {
			/*Dörtgen adında bir fonksiyon oluşturun
		 İçerisine tek bir değer giderse karenin çevresi(4*x)
		 İçerişine 2 değer giderse dikdörtgenin çevresi( (x+y)*2 )
		 İçerisine 4 değer giderse dörtgenin çevresini 
		 hesaplayın. (x+y+z+m)
		 */

	        dortgen(5);             // Kare: 4 * 5 = 20
	        dortgen(4, 6);          // Dikdörtgen: (4 + 6) * 2 = 20
	        dortgen(2, 3, 4, 5);    // Dörtgen: 2 + 3 + 4 + 5 = 14
	    }

	    // 1 parametreli - kare
	    public static void dortgen(int x) {
	        int cevre = 4 * x;
	        System.out.println("Karenin çevresi: " + cevre);
	    }

	    // 2 parametreli - dikdörtgen
	    public static void dortgen(int x, int y) {
	        int cevre = 2 * (x + y);
	        System.out.println("Dikdörtgenin çevresi: " + cevre);
	    }

	    // 4 parametreli - dörtgen
	    public static void dortgen(int x, int y, int z, int m) {
	        int cevre = x + y + z + m;
	        System.out.println("Dörtgenin çevresi: " + cevre);
	    }
}
