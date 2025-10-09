package hafta7;

public class De11Varargs {

	public static void main(String[] args) {
		/*Varargs kullanımı isteğe bağlıdır: 
		 * Varargs ile metot çağrılırken hiç argüman da verilmeyebilir, 
		 * tek bir argüman da verilebilir, birçok argüman da verilebilir. 
		 * Eğer hiç argüman verilmezse, varargs parametresi boş bir dizi
		 *  olarak alınır.*/
		topla();

	}
	public static int topla(int... a) {
        int toplam = 0;
        for (int w : a) {
        	toplam += w;
        }
        return toplam;
    }
}
