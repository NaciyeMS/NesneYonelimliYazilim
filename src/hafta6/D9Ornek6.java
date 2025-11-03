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
/*İKİNCİ ÇÖZÜM*/
/* 
 * Kişiler sorulara 1 ile 5 arasında cevaplar vermişlerdir. 
 * Ankette her soru için 
 * ÇOK OLUMLU görüşünü bildirmek isteyenler 1,
 *  OLUMLU görüşünü bildirmek isteyenler 2,
 *   TARAFSIZ görüşte olanlar 3,
 *    OLUMSUZ diyenler 4 
 *    ÇOK OLUMSUZ diyenler 5 kodlamışlardır.
 *     Her soru için cevapların yüzdelerini tablolayan bir program yazınız
*/
/*
String [] soru= {        "Yeni insanlarla tanışmayı severmisiniz?",     
		"İnsanlara yardım etmeyi sever misiniz?",        
		"Kolayca hayal kırıklığına uğrar mısınız?",
		"uzun vadeli hedefleriniz var mı?",   
		"Her zaman meşgul musunuz?"};
int n;
System.out.println("kaç kişi oy kullanacak");
Scanner klavye= new Scanner(System.in);
n=klavye.nextInt();
int [][]cvp=new int[5][5];
//başlangıçtaki değeleri atandı
for (int i = 0; i < 5; i++) {
	for (int j = 0; j < 0; j++) {
		cvp[i][j]=0;
	}
	
}
for (int i = 0; i < n; i++) {
	for (int j = 0; j < soru.length; j++) {
		System.out.println(soru[j]);
		System.out.println("1-ÇOK OLUMLU\n2-OLUMLU\n3-TARAFSIZ\n4-OLUMSUZ\n5-ÇOK OLUMSUZ");
		int x=klavye.nextInt();
		cvp[j][x-1]++;
	}
}
*/
/*	cvp	1		2		3		4		5		
 * 1.s	1		0		0		0		0
 * 2.s	0		0		0		0		0
 * 3.s	0		0		0		0		0		
 * 4.s	0		0		0		0		0
 * 5.s	0		0		0		0		0
 * */
/*
System.out.println("SORU                                    1-ÇOK OLUMLU 2-OLUMLU 3-TARAFSIZ 4-OLUMSUZ 5-ÇOK OLUMSUZ");
for (int i = 0; i < 5; i++) {
	
	System.out.print(String.format("%40s", soru[i]));
	for (int j = 0; j < 5; j++) {
		System.out.print(String.format("%12s", cvp[i][j]));
		
		
	}
	System.out.println();
}


}
*/
