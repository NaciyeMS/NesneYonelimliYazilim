package hafta7;

public class De10Varargs {

	public static void main(String[] args) {
		/*Varargs ile Dizi Geçirme: Varargs parametresine elle bir dizi 
		 * de geçirebilirsiniz. Java, bunu otomatik olarak kabul eder.*/
		int []dizi= {2,6,9,2,85,6};
		System.out.println(topla(dizi));

	}
	public static int topla(int... a) {
        int toplam = 0;
        for (int w : a) {
        	toplam += w;
        }
        return toplam;
    }
}
