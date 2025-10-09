package hafta6;

import java.util.Arrays;

public class D7CokBoyutluDizi {

	public static void main(String[] args) {
		/*Çok boyutlu diziler, birden fazla indeks ile 
		 * erişilebilen dizilerdir.En yaygın kullanılanı
		 *  iki boyutlu dizilerdir (matrisler), ama üç veya
		 *   daha fazla boyutlu diziler de mümkündür.
		 *   Temel kullanım amacı: tablo veya matris 
		 *   gibi verileri satır ve sütun şeklinde tutmaktır.
		 * */
		//içi boş bir dizi tanımlama 
		int [][] bDizi=new int[3][3];
		//içi dolu bir çok boyutlu dizi tanımlama 
		int [][] dizi={
				{56,85,0},
				{12,52,0},
                {32,49,0},
				{75,54,0}
			};
		System.out.println(dizi[ 2][1] );

		
		   int[][] a = new int[3][2]; 
		   //3 distaki, 2 icteki eleman sayisi
	        a[0][0] = 5;
	        a[0][1] = 12;
	        a[1][0] = 81;
	        a[1][1] = 45;
	        a[2][0] = 123;
	        a[2][1] = 0;
	        //System.out.println(Arrays.toString(a));
	        //MultiDimensional Array'leri yazdirirken toString() değil, 
	        //deepToString() method'u kullaniriz
	        System.out.println(Arrays.deepToString(a)); 
	        //[[5, 12], [81, 45], [123, 0]]
	}

}
