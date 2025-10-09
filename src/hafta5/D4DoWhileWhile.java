package hafta5;

import java.util.Iterator;

public class D4DoWhileWhile {

	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			System.out.println(i);
		}
		//for döngüsü ile yaptığımız işin aynısını 
		//while döngüsü ile de yapabiliriz
		int i=1;//başlangıç
		while(i<4)//bitiş kontrol
		{
			System.out.println(i);//tekrar eden iş 
			i++; //artış miktarı
		}
		//for döngüsü ile yaptığımız işin aynısını 
		//do while döngüsü ile de yapabiliriz
		i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<4);
	}

}
