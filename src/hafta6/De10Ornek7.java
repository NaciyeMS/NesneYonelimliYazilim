package hafta6;

import java.util.Scanner;

public class De10Ornek7 {

	public static void main(String[] args) {
		/*N tane öğrenciye ait vize ve final notlarını
		 *  ve öğrenci isimlerini kullanıcıdan alın.
		 *   Her öğrenciye ait ortalama ve harf notlarını
		 *    ekrana yazdırın.Vizenin %40 ı final in %60 
		 *    ı ile ortalama hesaplanır. 
*/
		Scanner tara = new Scanner(System.in);
        System.out.println("kaç öğrenci için veri gireceksin");
        int n=tara.nextInt();
        int [][] dizi= new int [n][3];
        String [] harf= new String[n];
        for (int i = 0; i < n; i++) {
        System.out.println((i+1)+". öğrenci vize notu ? ");
        dizi[i][0]=tara.nextInt();
        System.out.println((i+1)+". öğrenci final notu ? ");
        dizi[i][1]=tara.nextInt();
        dizi[i][2]=dizi[i][0]*40/100+dizi[i][1]*60/100;
        if( dizi[i][2]>=90) harf[i]="A";
        else if( dizi[i][2]>=80) harf[i]="A-";
        else if( dizi[i][2]>=75) harf[i]="B+";
        else if( dizi[i][2]>=70) harf[i]="B-";
        else if( dizi[i][2]>=65) harf[i]="C+";
        else if( dizi[i][2]>=60) harf[i]="C";
        else if( dizi[i][2]>=55) harf[i]="C-";
        else if( dizi[i][2]>=50) harf[i]="D+";
        else if( dizi[i][2]>=45) harf[i]="D";
        else if( dizi[i][2]>=40) harf[i]="D-";
        else if( dizi[i][2]>=35) harf[i]="D";
        else if( dizi[i][2]>=0) harf[i]="F+";
        }
        for (int i = 0; i < n; i++) {
    System.out.println((i+1)+". öğrenci:VİZE="+dizi[i][0]+
            "/FİNAL="+dizi[i][1]+"/ORTALAMA="+dizi[i][2]+
            "/HARF NOTU:"+harf[i]);           
        }


	}

}
