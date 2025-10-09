package hafta5;

public class De11Soru {

	public static void main(String[] args) {
		/*Rastgele harf üreten programı tasarlayın.
*/
		//32-126 ASCII karakterlerde harfler 32ile126 arası 
		//0-1....31-32-33-34........94.....126
		//0-1-2...31-32-33-34........94
	   //+32
		//32-33-34......................126
		int sayi=(int)(Math.random()*94)+32;
		 System.out.println((char)sayi);
		/*Rastgele 4 haneli şifre oluşturan bir programı tasarlayınız. 
		 * Şifredeki karakterlerin ikisi metin ikisi rakam olsun. 
*/
		//65-90 A-Z
		//97-122 a-z
		//0-9 
		int sayi1=(int)(Math.random()*25)+65;//A-Z
		int sayi2=(int)(Math.random()*25)+97;//a-z
		int sayi3=(int)(Math.random()*10);//0-9
		int sayi4=(int)(Math.random()*10);//0-9
		String sifeString=String.valueOf((char)sayi1)+String.valueOf((char)sayi2)+String.valueOf(sayi3)+String.valueOf(sayi4);
		System.out.println(sifeString);
	}

}
