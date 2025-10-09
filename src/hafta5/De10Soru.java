package hafta5;

import java.util.Scanner;

public class De10Soru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Bilgisayar aklından 0-100 arası rastgele bir sayı tutacak. 
•Bu sayıyı oyuncu sayıyı girerek tahmin edecek. 
•Eğer doğru tahmin ederse AFERİN diyecek. 
•Doğru tahmin edemezse 
•OLMADI! DAHA KÜÇÜK veya DAHA BÜYÜK SAYI TUT uyarısı yapacak. 
*/
		Scanner klavye=new Scanner(System.in);
		int sayac=0;
		int gsayi;
		int tsayi=(int)(Math.random()*100);
        do {
        	System.out.println("tahmin et bakalım!");
        	gsayi=klavye.nextInt();
        	sayac++;
        	if(gsayi>tsayi) System.out.println("Daha küçük sayı gir");
        	else if(gsayi<tsayi) System.out.println("Daha büyük sayı gir");
        }while(gsayi!=tsayi);
        System.out.println("tebrikler");
        System.out.println(sayac+". denemede buldun");
	
	}

}
