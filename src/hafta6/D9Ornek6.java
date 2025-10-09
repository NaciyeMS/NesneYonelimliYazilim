package hafta6;

import java.util.Scanner;

public class D9Ornek6 {

	public static void main(String[] args) {
		/*N tane kişiye bir toplumsal konudaki eğilimlerini
		 *  belirlemek üzere 5 tane soru sorulmuştur. 
		 *  Kişiler sorulara 1 ile 5 arasında cevaplar 
		 *  vermişlerdir. Ankette her soru için 
		 *  ÇOK OLUMLU görüşünü bildirmek isteyenler 1,
		 *   OLUMLU görüşünü bildirmek isteyenler 2,
		 *    TARAFSIZ görüşte olanlar 3, 		 *    
		 *    OLUMSUZ diyenler 4 ve
		 *     ÇOK OLUMSUZ diyenler 5 kodlamışlardır.
		 *      Her soru için cevapların yüzdelerini tablolayan
		 *       bir program yazınız
*/
	
		String [] sorular= { "Yeni insanlarla tanışmayı severmisiniz?",  
				"İnsanlara yardım etmeyi sever misiniz?",       
				"Kolayca hayal kırıklığına uğrar mısınız?",
				"uzun vadeli hedefleriniz var mı?",       
				"Her zaman meşgul musunuz?"};
		System.out.println("kaç kişiye anket uygulanacak");
		Scanner scan= new Scanner(System.in);
		int n= scan.nextInt();
		int [][] sonuc= new int[5][5]; 
		//beş durum var çok olumlu-olumlu-trafsızz...
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				sonuc[i][j]=0;
				}}
		for (int i=0;i<n;i++){
			System.out.println("Hoşgeldiniz, anketimiz başlıyor \n Her soruya 1 ile 5 arasında puanlama veriniz.\n 1-Çok olumlu, 2-Olumlu, 3-Tarafsız, 4-Olumsuz, 5-Çok Olumsuz");
			for (int j = 0; j < sorular.length; j++) {
				System.out.println(sorular[j]);
				int cevap= scan.nextInt();
				/*if(cevap==1) sonuc[j][0]++;
				 *         else if(cevap==2) sonuc[j][1]++;
				 *          else if(cevap==3) sonuc[j][2]++;
				 *          else if(cevap==4) sonuc[j][3]++;
				 *          else if(cevap==5) sonuc[j][4]++;*/
				sonuc[j][cevap-1]++;
				}}
		System.out.println("soruno/ÇO/O/T/OS/ÇOS/");
		for (int i = 0; i < 5; i++) {
			System.out.print((i+1)+".soru");  
			for (int j = 0; j < 5; j++) {
				System.out.print(sonuc[i][j]*100/n+"/");   
				}   
			System.out.println();
			}


	}

}
