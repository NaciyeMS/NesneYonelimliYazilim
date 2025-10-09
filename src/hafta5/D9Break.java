package hafta5;

public class D9Break {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i==4) {
				break;
			}
			System.out.println(i);
		}

	}

}
/*
 * 1. break Komutu

Döngüyü tamamen sonlandırır.

Çalıştığı noktadan itibaren döngüden çıkar, program döngüden sonraki satırdan devam eder.

Genellikle bir koşul sağlandığında artık döngüye gerek kalmazsa kullanılır.
 * 
 * EKRAN ÇIKTISI 
 * 
0
1
2
3

*/
