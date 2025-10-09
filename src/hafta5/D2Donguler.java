package hafta5;

public class D2Donguler {

	public static void main(String[] args) {
		
		/*1 den 100 e kadar olan sayıların toplamını bulmak */
		int toplam=0;
		for(int i=1;i<=100;i++) {
			toplam=toplam +i;//toplam+=i;
		}
		System.out.println(toplam);
		
		/*KAĞIT ÜZERİNDE ÇALIŞTIRMA
		 * 
		 * şimdilik 5 e kadar yazdırsaydı
		 * 
		i		i<5		toplam=toplam+i	
		1		true		  =0+1->1
		2		true		  =1+2->3
		3		true		  =3+3->6
		4		true		  =6+4->10
		5		true		  =10+5->15
		6		false			döngü bitti
		
		toplam yazdırıldı ekrana //15
		*/
		
		/*1 den 100 e kadar olan sayıların çarpımını bulmak */
		int carpim=0;
		for(int i=1;i<=100;i++) {
			carpim=carpim *i;
		}
		System.out.println(carpim);
		/*KAĞIT ÜZERİNDE ÇALIŞTIRMA
		 * 
		 * şimdilik 5 e kadar yazdırsaydı
		 * 
		i		i<5		toplam=toplam*i	
		1		true		  =0*1->0
		2		true		  =0*2->0
		3		true		  =0*3->0
		4		true		  =0+4->0
		5		true		  =0+5->0
		6		false			döngü bitti
		
		çarpım yazdırıldı ekrana //0
		*/
		//toplama da etkisiz eleman 0 
		//çarpmada etkisiz eleman 1 dir
		//:)
	}

}
