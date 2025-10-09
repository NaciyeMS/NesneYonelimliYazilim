package hafta5;

public class D8Continue {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(i==4) {
				continue;
			}
			System.out.println(i);
		}

	}

}
/*
 *  continue Komutu
Döngüyü sonlandırmaz, sadece o adımdaki işlemleri atlar.
Koşula denk gelirse, döngü bir sonraki adımdan devam eder.
 * EKRAN ÇIKTISI 
 * 
 * 
0
1
2
3
5
6
7
8
9
*/
